grammar WHILE;

program
    : p EOF
    ;

p
    : command #singleCommand
    | command ';' p #multipleCommands
    ;

command
    : var ':=' var '+' naturalNumber #addition
    | var ':=' var '-' naturalNumber #subtraction
    | 'LOOP' var 'DO' p 'END' #loop
    | 'WHILE' var '!=' '0' 'DO' p 'END' #while
    ;

var
    : 'x_' naturalNumber
    ;

naturalNumber
    : digitWithoutZero naturalNumberWithLeadingZeros #multiDigitNumber
    | digit #singleDigitNumber
    ;

naturalNumberWithLeadingZeros
    : digit naturalNumberWithLeadingZeros #multiDigitNumberWithLeadingZeros
    | digit #singleDigitNumberWithLeadingZeros
    ;

digitWithoutZero
    : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
    ;

digit
    : digitWithoutZero #digitWithoutZeroLabel
    | '0' #zero
    ;

WS : ( ' ' | '\t' | '\n' | '\r' )+
     {skip();}
   ;


