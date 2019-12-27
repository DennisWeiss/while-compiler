package com.weissdennis.whilecompiler;

import com.weissdennis.whilecompiler.parser.WHILEBaseVisitor;
import com.weissdennis.whilecompiler.parser.WHILEParser;

public class WHILEToJavaCompiler extends WHILEBaseVisitor<String> {

    private long loopCounter = 0;
    private long maxVariable = 0;

    public String compileWHILEToJava(WHILEParser.ProgramContext ctx, String className) {
        String compiledProgram = visitProgram(ctx);
        String initializeVariables = initializeVariables();
        resetFields();
        return "class Main {\n\tpublic static void main(String[] args) {\n\t\t"+
                initializeVariables.replace("\n", "\n\t\t") + "\n\t\t" +
                "for (int i = 0; i < args.length; i++) {\n\t\t\tx[i+1] = Long.parseLong(args[i]);\n\t\t}\n\n\t\t" +
                compiledProgram.replace("\n", "\n\t\t") + "\n\n\t\tSystem.out.println(x[0]);\n\t}\n}";
    }

    private String initializeVariables() {
        return String.format("long[] x = new long[%d];\n", maxVariable + 1);

    }

    private void resetFields() {
        loopCounter = 0;
        maxVariable = 0;
    }

    @Override
    public String visitProgram(WHILEParser.ProgramContext ctx) {
        return visit(ctx.p());
    }

    @Override
    public String visitSingleCommand(WHILEParser.SingleCommandContext ctx) {
        return visit(ctx.command());
    }

    @Override
    public String visitMultipleCommands(WHILEParser.MultipleCommandsContext ctx) {
        return visit(ctx.command()) + "\n" + visit(ctx.p());
    }

    @Override
    public String visitAddition(WHILEParser.AdditionContext ctx) {
        return String.format("%s = %s + %s;",
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ctx.getChild(4).getText()
        );
    }

    @Override
    public String visitSubtraction(WHILEParser.SubtractionContext ctx) {
        return String.format("%s = %s - %s;",
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2)),
                ctx.getChild(4).getText()
        );
    }

    @Override
    public String visitLoop(WHILEParser.LoopContext ctx) {
        loopCounter++;
        return String.format("for (long i_%d = 0; i_%d < %s; i_%d++) {\n\t%s\n}",
                loopCounter,
                loopCounter,
                visit(ctx.getChild(1)),
                loopCounter,
                visit(ctx.p()).replace("\n", "\n\t")
        );
    }

    @Override
    public String visitWhile(WHILEParser.WhileContext ctx) {
        return String.format("while (%s != 0) {\n\t%s\n}",
                visit(ctx.getChild(1)),
                visit(ctx.getChild(5)).replace("\n", "\n\t")
        );
    }

    @Override
    public String visitVar(WHILEParser.VarContext ctx) {
        long variableNumber = Long.parseLong(ctx.naturalNumber().getText());
        if (variableNumber > maxVariable) {
            maxVariable = variableNumber;
        }
        return String.format("x[%d]", variableNumber);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return (aggregate != null ? aggregate : "") + (nextResult != null ? nextResult : "");
    }
}
