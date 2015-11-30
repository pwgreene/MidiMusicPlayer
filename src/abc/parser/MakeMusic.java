package abc.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.LineContext;

public class MakeMusic implements AbcListener {

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
