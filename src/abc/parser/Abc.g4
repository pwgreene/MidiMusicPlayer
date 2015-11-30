/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

line: index title (length | tempo | meter | composer | comment)* key body EOF;
x: "X:" INDEX
INDEX: [0:9]+
t: "T:" TITLE
TITLE: .*
l: "L:" LENGTH
LENGTH: ( [0-9]+ "/" [0-9]+ ) | [0-9]+
q: "Q:" "C" | "C|" | (BPT = BPM)
BPM: [0-9]+
BPT: [0-9]+ "/" [0-9]+
m: "M:" METER
METER: [0-9]+ "/" [0-9]+
c: "C:" COMPOSER
COMPOSER: .*
k: "K:" key

key: keynote mode-minor?
keynote: basenote key-accidental?
key-accidental: "X" | "b"
mode-minor: "m"

body:

