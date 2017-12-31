/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

@SuppressWarnings("nls")
public final class TReturn extends Token
{
    public TReturn()
    {
        super.setText("return");
    }

    public TReturn(int line, int pos)
    {
        super.setText("return");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReturn(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReturn(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReturn text.");
    }
}
