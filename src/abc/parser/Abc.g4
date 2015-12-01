/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

line: index EOF;
INDEX: X\: [0-9]+

chord: '[' SINGLENOTE* ']'
TUPLET: '(3' SINGLENOTE SINGLENOTE SINGLENOTE
SINGLENOTE: (('^'?'^'?) | ('_'?'_'?)) ([a-g]|[A-G])
