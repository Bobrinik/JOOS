/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

@SuppressWarnings("nls")
public final class ANonmodMethod extends PMethod
{
    private PReturntype _returntype_;
    private TIdentifier _identifier_;
    private final LinkedList<PFormal> _formals_ = new LinkedList<PFormal>();
    private final LinkedList<PStm> _stmts_ = new LinkedList<PStm>();

    public ANonmodMethod()
    {
        // Constructor
    }

    public ANonmodMethod(
        @SuppressWarnings("hiding") PReturntype _returntype_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<?> _formals_,
        @SuppressWarnings("hiding") List<?> _stmts_)
    {
        // Constructor
        setReturntype(_returntype_);

        setIdentifier(_identifier_);

        setFormals(_formals_);

        setStmts(_stmts_);

    }

    @Override
    public Object clone()
    {
        return new ANonmodMethod(
            cloneNode(this._returntype_),
            cloneNode(this._identifier_),
            cloneList(this._formals_),
            cloneList(this._stmts_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonmodMethod(this);
    }

    public PReturntype getReturntype()
    {
        return this._returntype_;
    }

    public void setReturntype(PReturntype node)
    {
        if(this._returntype_ != null)
        {
            this._returntype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._returntype_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PFormal> getFormals()
    {
        return this._formals_;
    }

    public void setFormals(List<?> list)
    {
        for(PFormal e : this._formals_)
        {
            e.parent(null);
        }
        this._formals_.clear();

        for(Object obj_e : list)
        {
            PFormal e = (PFormal) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._formals_.add(e);
        }
    }

    public LinkedList<PStm> getStmts()
    {
        return this._stmts_;
    }

    public void setStmts(List<?> list)
    {
        for(PStm e : this._stmts_)
        {
            e.parent(null);
        }
        this._stmts_.clear();

        for(Object obj_e : list)
        {
            PStm e = (PStm) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._stmts_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._returntype_)
            + toString(this._identifier_)
            + toString(this._formals_)
            + toString(this._stmts_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._returntype_ == child)
        {
            this._returntype_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._formals_.remove(child))
        {
            return;
        }

        if(this._stmts_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._returntype_ == oldChild)
        {
            setReturntype((PReturntype) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PFormal> i = this._formals_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFormal) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PStm> i = this._stmts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStm) newChild);
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
