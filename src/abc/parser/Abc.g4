/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

COMMENT : '%' (~'\n')* -> skip;
FIELD_NUMBER : 'X:' (SPACE)* DIGIT+ ;
FIELD_TITLE : 'T:' (SPACE)*  (~'\n')+ ; 
FIELD_COMPOSER : 'C:' (SPACE)*  (~'\n')+ ; 
FIELD_DEFAULT_LENGTH : 'L:' (SPACE)* (DIGIT+ '/' DIGIT+) ;
FIELD_METER : 'M:' (SPACE)* ('C' | 'C|' | (DIGIT+ '/' DIGIT+)) ;
FIELD_TEMPO  : 'Q:' (SPACE)* ((DIGIT+ '/' DIGIT+) '=')? DIGIT+ ;
FIELD_VOICE : 'V:' (SPACE)*  (~'\n')+ ; 
FIELD_KEY: 'K:' (SPACE)* ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') KEYACCIDENTAL? MODEMINOR?;

LINE : ('\t' | '\r' | '\n')+ ;
NOTE : (PITCH | REST) ( SLASH | (DIGIT+ SLASH) | (SLASH? DIGIT+) | (DIGIT+ '/' DIGIT+))?;
PITCH : ('^' | '^^' | '_' | '__' | '=')? ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') ('\''+ | ','+)?;
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
SPACE : ' '+ -> skip;
REST : 'z';

OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTH_REPEAT : '[1' | '[2';

DUPLET : '(2';
TRIPLET : '(3';
QUADRUPLET : '(4';
SLASH: '/';
DIGIT : [0-9];

root: header body EOF;

field_voice: FIELD_VOICE;

header : field_number LINE field_title LINE (other_fields LINE)* field_key LINE;

field_number : FIELD_NUMBER;
field_title : FIELD_TITLE;
other_fields : FIELD_COMPOSER | FIELD_DEFAULT_LENGTH | FIELD_METER | FIELD_TEMPO | FIELD_VOICE;
field_key : FIELD_KEY ;

body: abcline+;
abcline: (element+ LINE) | (field_voice LINE) | LINE;
open_bracket : OPEN_BRACKET;
close_bracket : CLOSE_BRACKET;
multinote: open_bracket (note_element)+ close_bracket;
note_element : NOTE | multinote;
tuplet_element : (DUPLET element element) | (TRIPLET element element element) | (QUADRUPLET element element element element);
barline : (BARLINE | NTH_REPEAT) SPACE*;
element : (note_element | tuplet_element | barline ) (SPACE*) ;


