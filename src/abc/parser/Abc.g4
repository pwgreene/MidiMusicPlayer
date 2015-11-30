/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

line: (meter | default | key | name | tempo | title)* EOF;
meter:
default:
key:
name:
tempo:
title:
index:
notes:

