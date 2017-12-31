/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

@SuppressWarnings("nls")
public final class ADeclFirstStm extends PStm
{
    private PType _type_;
    private final LinkedList<TIdentifier> _identifiers_ = new LinkedList<TIdentifier>();

    public ADeclFirstStm()
    {
        // Constructor
    }

    public ADeclFirstStm(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") List<?> _identifiers_)
    {
        // Constructor
        setType(_type_);

        setIdentifiers(_identifiers_);

    }

    @Override
    public Object clone()
    {
        return new ADeclFirstStm(
            cloneNode(this._type_),
            cloneList(this._identifiers_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclFirstStm(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public LinkedList<TIdentifier> getIdentifiers()
    {
        return this._identifiers_;
    }

    public void setIdentifiers(List<?> list)
    {
        for(TIdentifier e : this._identifiers_)
        {
            e.parent(null);
        }
        this._identifiers_.clear();

        for(Object obj_e : list)
        {
            TIdentifier e = (TIdentifier) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._identifiers_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._identifiers_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._identifiers_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        for(ListIterator<TIdentifier> i = this._identifiers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TIdentifier) newChild);
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
