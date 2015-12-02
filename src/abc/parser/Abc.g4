/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: x t (l | q | m | c | comment | v)* k body EOF;
/*HEADER*/
x: HEADERX INDEX eol;
HEADERX: 'X:';
INDEX: [0:9]+;

t: HEADERT TITLE eol;
HEADERT: 'T:';
TITLE: .*;

l: HEADERL LENGTH eol;
HEADERL: 'L:';
LENGTH: ( [0-9]+ '/' [0-9]+ ) | [0-9]+;

q: HEADERQ 'C' | 'C|' | (BPT = BPM) eol;
HEADERQ: 'Q:';
BPM: [0-9]+;
BPT: [0-9]+ '/' [0-9]+;

m: HEADERM METER eol;
HEADERM: 'M:';
METER: [0-9]+ '/' [0-9]+;

c: HEADERC COMPOSER eol;
HEADERC: 'C:';
COMPOSER: .*;

v: 'V:' VOICE eol;
HEADERV: 'V:';
VOICE: .*;

k: 'K:' key eol;
HEADERK: 'K:';
key: keynote MODEMINOR?;
keynote: BASENOTE KEYACCIDENTAL?;
KEYACCIDENTAL: '#' | 'b';
MODEMINOR: 'm';

/*BODY OF MUSIC*/
body: eol;
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

midtunefield: v;

BASENOTE: 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
DIGIT: [0-9];

/*GENERAL:*/
eol: comment | NEWLINE;
comment: '%' text NEWLINE;
text: .*;
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';

/* tell Antlr to ignore spaces around tokens. */
/*SPACES : [ ]+ -> skip;*/
