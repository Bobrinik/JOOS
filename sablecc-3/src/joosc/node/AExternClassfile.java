/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

@SuppressWarnings("nls")
public final class AExternClassfile extends PClassfile
{
    private final LinkedList<PExternClass> _classes_ = new LinkedList<PExternClass>();

    public AExternClassfile()
    {
        // Constructor
    }

    public AExternClassfile(
        @SuppressWarnings("hiding") List<?> _classes_)
    {
        // Constructor
        setClasses(_classes_);

    }

    @Override
    public Object clone()
    {
        return new AExternClassfile(
            cloneList(this._classes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternClassfile(this);
    }

    public LinkedList<PExternClass> getClasses()
    {
        return this._classes_;
    }

    public void setClasses(List<?> list)
    {
        for(PExternClass e : this._classes_)
        {
            e.parent(null);
        }
        this._classes_.clear();

        for(Object obj_e : list)
        {
            PExternClass e = (PExternClass) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._classes_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classes_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PExternClass> i = this._classes_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExternClass) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}