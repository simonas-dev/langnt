grammar Langnt;

@header {
   package langnt;
}

parse
 : block EOF
 ;

// A block, can be a variable or a function.
block
 : (statement | functionDeclaration)* (Return expression)?
 ;

// A generate statement, for example assignment var a: 1
statement
 : assignment
 | reAssignment
 | functionCall
 | completeIfStatement
 | eachLoopStatement
 | loopStatement
 ;

/*
    Assign a value to a variable.

    var a: 1
    var b
*/
assignment
 : Var Identifier indexes? ':' expression
 | Var Identifier indexes?
 ;

/*
    Re-assign an existing variable value.

    var a: 1
    a: yes
*/
reAssignment
 : Identifier indexes? ':' expression
 ;

functionCall
 : Identifier   '(' expressionList? ')' #identifierFunctionCall
 | Print        '(' expression ')'      #showFunctionCall
 | PrintLine    '(' expression? ')'     #showLineFunctionCall
 | Assert       '(' expression ')'      #assertFunctionCall
 | Size         '(' expression ')'      #sizeFunctionCall
 ;

/*
    A complete if statement.

    _if(...) {

    } _elif(...) {

    } _el {

    }
*/
completeIfStatement
 : ifStatement elseIfStatement* elseStatement? Close
 ;

// _if
ifStatement
 : If '(' expression ')' Open block
 ;

// } _elif {
elseIfStatement
 : Close ElseIf '(' expression ')' Open block
 ;

// } _el {
elseStatement
 : Close Else Open block
 ;

/*
    Delcare a function, with args and no args.

    _func test(a, b : 3) {
    }

    _fun test() {
    }
*/
functionDeclaration
 : Func Identifier '(' argumentList? ')' Open block Close
 ;

/*
    A for-each like loop for strings and lists.

    _each(a : 'abc) {
        // loop stuff...
    }
*/
eachLoopStatement
 : Loop '(' Identifier Colon expression ')' Open block Close
 ;

/*
    A simple while type loop.

    keb a: 0
    _loop(a < 10) {
        a: a + 1
    }
*/
loopStatement
 : Loop '(' expression ')' Open block Close
 ;

// Function argument list, including optionals.
argumentList
 : argument (',' argument)*
 ;

// Expressions passed to a function.
expressionList
 : expression (',' expression)*
 ;

// All avaliable expressions.
expression
 : '-' expression                           #unaryMinusExpression
 | '!' expression                           #notExpression
 | expression '^' expression                #powerExpression
 | expression '*' expression                #multiplyExpression
 | expression '/' expression                #divideExpression
 | expression '%' expression                #modulusExpression
 | expression '+' expression                #addExpression
 | expression '-' expression                #subtractExpression
 | expression '>=' expression               #gtEqExpression
 | expression '<=' expression               #ltEqExpression
 | expression '>' expression                #gtExpression
 | expression '<' expression                #ltExpression
 | expression '==' expression               #eqExpression
 | expression '!=' expression               #notEqExpression
 | expression '&&' expression               #andExpression
 | expression '||' expression               #orExpression
 | expression '?' expression ':' expression #ternaryExpression
 | expression In expression                 #inExpression
 | Number                                   #numberExpression
 | Bool                                     #boolExpression
 | Empty                                    #emptyExpression
 | functionCall indexes?                    #functionCallExpression
 | list indexes?                            #listExpression
 | Identifier indexes?                      #identifierExpression
 | String indexes?                          #stringExpression
 | '(' expression ')' indexes?              #expressionExpression
 | Input '(' String? ')'                    #inputExpression
 ;

// List with expressions.
list
 : '[' expressionList? ']'
 ;

// List indexes.
indexes
 : ('[' expression ']')+
 ;

// Function argument or argument with default value.
argument
 : Identifier (':' expression)?
 ;

// General tokens.
Open        : '{';
Close       : '}';
Var         : 'var';
Return      : 'return';

// If statements.
If          : 'if';
Else        : 'wat';
ElseIf      : 'ifnt';

// Printing of variables and stuff.
Print       : 'print';
PrintLine   : 'println';

// Loops : foreach and simple loop.
EachLoop    : 'each';
Loop        : 'loop';

// Function stuff.
Func        : 'fu';

// todo sort out
Input       : 'input';
Assert      : 'assert';
Size        : 'size';
In          : 'in';
Empty       : 'empty';

// Generic operations and misc tokens.
Or          : '||';
And         : '&&';
Equals      : '==';
NEquals     : '!=';
GTEquals    : '>=';
LTEquals    : '<=';
Pow         : '^';
Excl        : '!';
GT          : '>';
LT          : '<';
Add         : '+';
Subtract    : '-';
Multiply    : '*';
Divide      : '/';
Modulus     : '%';
OBracket    : '[';
CBracket    : ']';
OParen      : '(';
CParen      : ')';
SColon      : ';';
Assign      : '=';
Comma       : ',';
QMark       : '?';
Colon       : ':';

// Yes = true, no = false.
Bool
 : 'yes'
 | 'yesnt'
 ;

// All numbers are of double type.
Number
 : Int ('.' Digit*)?
 ;

// Id naming.
Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

// String, 'someString "Inner"'
String
 : ['] (~['\r\n] | '\\\\' | '\\\'')* [']
 ;

// Comment -> @ Comment goes here.
Comment
 : ('NOTCODE' ~[\r\n]*) -> skip
 ;

// Ignore spaces.
Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;

fragment Digit
 : [0-9]
 ;