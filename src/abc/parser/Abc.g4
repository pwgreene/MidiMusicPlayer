/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: X T (L | Q | M | C | comment | V)* K body EOF;
/*HEADER*/
X: 'X:' [0-9]+ '\n';

T: 'T:' ~('\r' | '\n')+ '\n';

L: 'L:' LENGTH '\n';
LENGTH: ( [0-9]+ '/' [0-9]+ ) | [0-9]+;

Q: 'Q:' 'C' | 'C|' | (BPT = BPM);
BPM: [0-9]+;
BPT: [0-9]+ '/' [0-9]+;

M: 'M:' METER '\n';
METER: [0-9]+ '/' [0-9]+;

C: 'C:' ~('\r' | '\n')+ '\n';

V: 'V:' ~('\r' | '\n')+ '\n';

K: 'K:' BASENOTE ('#'| 'b')? 'm'? '\n';

/*BODY OF MUSIC*/
body: abcmusic;
abcmusic: abcline+;
abcline: element+ NEWLINE | midtunefield | comment;
element: noteelement | tupletelement | BARLINE | NTHREPEAT | WHITESPACE;

noteelement: note | multinote;

note: noteorrest notelength?;
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
DIGIT: [0-9];

/*GENERAL:*/
eol: comment | NEWLINE;
comment: '%' text NEWLINE;
text: .*;
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';

/* tell Antlr to ignore spaces and newlines around tokens. */
WS : [ ]+ -> skip;
