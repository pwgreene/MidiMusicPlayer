/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

abc: x t (l | q | m | c | comment | v)* k body EOF;
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
KEYACCIDENTAL: 'X' | 'b';
MODEMINOR: 'm';

/*BODY OF MUSIC*/
body: eol;

BASENOTE: 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';


/*GENERAL:*/
eol: comment | NEWLINE;
comment: '%' text NEWLINE;
text: .*;
NEWLINE: '\n' | '\r' '\n'?;

/* tell Antlr to ignore spaces around tokens. */
SPACES : [ ]+ -> skip;
