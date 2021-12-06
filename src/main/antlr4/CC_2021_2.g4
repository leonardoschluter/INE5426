grammar CC_2021_2;
// Declaração para informar o gerador de código a incluir uma lista de errors
// essa lista será utilizada por regras específicas de erros. Por hora apenas Invalid.
@lexer::members {
  public List<String> errors = new ArrayList<String>();
}

program: ( statement | funcList )?;
funcList: funcDef funcList | funcDef ;
funcDef: DEF Identifier OPEN_PAR paramList CLOSE_PAR OPEN_CHAVE stateList CLOSE_CHAVE;
paramList: (
    (type Identifier COLON paramList) |
    (type Identifier)
)?;

statement: (
    (varDecl SEMI_COLON) |
    (atribStat SEMI_COLON) |
    (printStat SEMI_COLON) |
    (readStat SEMI_COLON) |
    (returnStat SEMI_COLON) |
    (ifStat SEMI_COLON) |
    (forState SEMI_COLON) |
    (OPEN_CHAVE stateList CLOSE_CHAVE) |
    (BREAK SEMI_COLON) |
    SEMI_COLON) ;

varDecl: type Identifier (OPEN_COL IntegerConstant CLOSE_COL)*;
atribStat: lValue ASSIGN ( expression | allocExpression | funcCall);

funcCall: Identifier OPEN_PAR paramListCall CLOSE_PAR;

paramListCall: (Identifier COLON paramListCall | Identifier)?;

printStat: PRINT expression;

readStat: READ lValue;

returnStat: RETURN;

ifStat: IF OPEN_PAR expression CLOSE_PAR statement (ELSE statement)?;

forState: FOR OPEN_PAR atribStat SEMI_COLON expression SEMI_COLON atribStat CLOSE_PAR statement;

stateList: statement ( stateList )?;

allocExpression: NEW type (OPEN_COL IntegerConstant CLOSE_COL)+ ;

expression: (numExpression ((LESS | LESS_EQUAL | EQUAL | GREATER | GREATER_EQUAL | DIFFERENT) numExpression)?) | StringConstant;

numExpression: term ((PLUS | SUBTR) term)?;

term: unaryExpression (( MULT | DIV | REMINDER ) unaryExpression)* ;

unaryExpression: (PLUS | SUBTR)? factor ;

factor: (IntegerConstant | FloatConstant | StringConstant | NULL | lValue | OPEN_PAR numExpression CLOSE_PAR);

lValue: Identifier (OPEN_COL numExpression CLOSE_COL)*;

type : (INT | FLOAT | STRING);

/* reserved words*/
DEF: 'def';
INT: 'int';
FLOAT:	'float';
STRING:	'string';
BREAK:	'break';
PRINT:	'print';
READ:	'read';
RETURN:	'return';
IF:	'if';
ELSE:	'else';
FOR:	'for';
NEW:	'new';
NULL:	'null';

/* symbols */
OPEN_PAR:	'(';
CLOSE_PAR:	')';
OPEN_CHAVE:	'{';
CLOSE_CHAVE:	'}';
SEMI_COLON:	';';
OPEN_COL:	'[';
CLOSE_COL:	']';
ASSIGN: '=';
COLON:	',';
LESS:   '<';
GREATER:	'>';
LESS_EQUAL: 	'<=';
GREATER_EQUAL:	'>=';
EQUAL:	'==';
DIFFERENT:	'!=';
PLUS:	'+';
SUBTR:  '-';
MULT:	'*';
DIV	: '/';
REMINDER: 	'%';

// ** Identifier
Identifier:	Letter LetterOrDigit*;

fragment
Letter:	[a-zA-Z] ;

fragment
LetterOrDigit:	[a-zA-Z0-9];


// ** Numbers
IntegerConstant: Numeral* ;

fragment
Numeral
	:	'0'
	|	NonZeroDigit (Digits?)
	;

fragment
Digits
	:	Digit*
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

FloatConstant
	:	Digits '.' Digits? ;

// Strings
// Coloquei no channel Hidden para não ser identificado como um token inválido
// mas preciso ignorá-los de alguma forma para não serem reconhecidos como tokens válidos
WhiteSpace:   (' '
    |   '\t'
    |   '\n'
    |   '\r')+
       -> channel(HIDDEN)
    ;

/*
StringCharacter -> [a-zA-Z\u00C0-\u00FF ]+
StringCharacters -> StringCharacter+
STRING_CONSTANT -> '"' StringCharacters? '"'
*/
StringConstant
	:	'"' StringCharacters? '"'
	;
fragment
StringCharacters
	:	StringCharacter+
	;

// ~ captura qualquer caractere que não esteja listado em um range []
fragment
StringCharacter
	:	~["\\]
	;

// Criei essa nova regra para conseguir capturar caractéres inválidos,
// basicamente aceita qualquer char que já não tenha sido aceito
Invalid
  :  . {
         errors.add("Invalid character: '" + text + "' on line: " +
             getLine() + ", index: " + getCharPositionInLine());
       }
  ;
