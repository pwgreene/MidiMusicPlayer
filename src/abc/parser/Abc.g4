/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: X T (L | Q | M | C | comment | V)* K body EOF;
/*HEADER*/
X: 'X:' [0-9]+ NEWLINE;

T: 'T:' ~('\r' | '\n')+ NEWLINE;

L: 'L:' LENGTH NEWLINE;
LENGTH: ( [0-9]+ '/' [0-9]+ ) | [0-9]+;

Q: 'Q:' 'C' | 'C|' | (BPT = BPM) NEWLINE;
BPM: [0-9]+;
BPT: [0-9]+ '/' [0-9]+;

M: 'M:' METER NEWLINE;
METER: [0-9]+ '/' [0-9]+;

C: 'C:' ~('\r' | '\n')+ NEWLINE;

V: 'V:' ~('\r' | '\n')+ NEWLINE;

K: 'K:' BASENOTE ('#'| 'b')? 'm'? NEWLINE;

/*BODY OF MUSIC*/
body: abcmusic;
abcmusic: abcline+;
abcline: element+ NEWLINE | midtunefield | comment;
element: noteelement | tupletelement | BARLINE | NTHREPEAT | WHITESPACE;

noteelement: note | multinote;

note: noteorrest notelength;
noteorrest: pitch | rest;
pitch: ACCIDENTAL? BASENOTE octave?;
octave: '\''+ | ','+;
notelength: (DIGIT+)? ('/' (DIGIT+)?)?;
notelengthstrict: DIGIT+ '/' DIGIT+;

ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';

rest: 'z';

tupletelement: tupletspec noteelement+;
tupletspec: '(' DIGIT; 

multinote: '[' note+ ']';

BARLINE: '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT: '[1' | '[2';

midtunefield: V;

BASENOTE: 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

/*GENERAL:*/
eol: comment | NEWLINE;
comment: '%' NEWLINE;
/*text: .*;*/
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';
DIGIT: [0-9];

/* tell Antlr to ignore spaces and newlines around tokens. */
//WS : [ ]+ -> skip;
