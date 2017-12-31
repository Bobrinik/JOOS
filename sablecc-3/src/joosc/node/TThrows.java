/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

@SuppressWarnings("nls")
public final class TThrows extends Token
{
    public TThrows()
    {
        super.setText("throws");
    }

    public TThrows(int line, int pos)
    {
        super.setText("throws");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TThrows(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTThrows(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TThrows text.");
    }
}
