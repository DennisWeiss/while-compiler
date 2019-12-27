package com.weissdennis.whilecompiler;

import com.weissdennis.whilecompiler.parser.WHILELexer;
import com.weissdennis.whilecompiler.parser.WHILEParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WHILELexer lexer = new WHILELexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WHILEParser parser = new WHILEParser(tokens);
        WHILEParser.ProgramContext program = parser.program();

        WHILEToJavaCompiler compiler = new WHILEToJavaCompiler();
        String compiledProgram = compiler.compileWHILEToJava(program, classNameFromFileName(args[1]));

        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        fileOutputStream.write(compiledProgram.getBytes());
        fileOutputStream.close();
    }

    private static String classNameFromFileName(String fileName) {
        return fileName.split("\\.")[0];
    }
}
