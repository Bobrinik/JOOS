/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.analysis;

import joosc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseADefaultClassfile(ADefaultClassfile node);
    void caseAExternClassfile(AExternClassfile node);
    void caseAClass(AClass node);
    void caseAFinalClassmods(AFinalClassmods node);
    void caseAAbstractClassmods(AAbstractClassmods node);
    void caseAExternClass(AExternClass node);
    void caseAExtension(AExtension node);
    void caseAReferenceType(AReferenceType node);
    void caseACharType(ACharType node);
    void caseABooleanType(ABooleanType node);
    void caseAIntType(AIntType node);
    void caseAPolynullType(APolynullType node);
    void caseAVoidType(AVoidType node);
    void caseAFirstField(AFirstField node);
    void caseAField(AField node);
    void caseAOnefield(AOnefield node);
    void caseAConstructor(AConstructor node);
    void caseAExternConstructor(AExternConstructor node);
    void caseAFormal(AFormal node);
    void caseAModMethod(AModMethod node);
    void caseANonmodMethod(ANonmodMethod node);
    void caseAAbstractMethod(AAbstractMethod node);
    void caseAMainMethod(AMainMethod node);
    void caseAFinalMethodmods(AFinalMethodmods node);
    void caseASynchronizedMethodmods(ASynchronizedMethodmods node);
    void caseAMainargv(AMainargv node);
    void caseAModExternMethod(AModExternMethod node);
    void caseANonmodExternMethod(ANonmodExternMethod node);
    void caseAFinalExternMethodmods(AFinalExternMethodmods node);
    void caseAAbstractExternMethodmods(AAbstractExternMethodmods node);
    void caseASynchronizedExternMethodmods(ASynchronizedExternMethodmods node);
    void caseAVoidReturntype(AVoidReturntype node);
    void caseANonvoidReturntype(ANonvoidReturntype node);
    void caseASkipStm(ASkipStm node);
    void caseABlockStm(ABlockStm node);
    void caseAExpStm(AExpStm node);
    void caseAReturnStm(AReturnStm node);
    void caseADeclFirstStm(ADeclFirstStm node);
    void caseADeclStm(ADeclStm node);
    void caseASuperconsStm(ASuperconsStm node);
    void caseAIfStm(AIfStm node);
    void caseAIfelseStm(AIfelseStm node);
    void caseAWhileStm(AWhileStm node);
    void caseAOnelocal(AOnelocal node);
    void caseAAssignExp(AAssignExp node);
    void caseAOrExp(AOrExp node);
    void caseAAndExp(AAndExp node);
    void caseAEqExp(AEqExp node);
    void caseANeqExp(ANeqExp node);
    void caseALtExp(ALtExp node);
    void caseAGtExp(AGtExp node);
    void caseALeqExp(ALeqExp node);
    void caseAGeqExp(AGeqExp node);
    void caseAInstanceofExp(AInstanceofExp node);
    void caseAPlusExp(APlusExp node);
    void caseAMinusExp(AMinusExp node);
    void caseAMultExp(AMultExp node);
    void caseADivExp(ADivExp node);
    void caseAModExp(AModExp node);
    void caseAUminusExp(AUminusExp node);
    void caseANotExp(ANotExp node);
    void caseATmpcastExp(ATmpcastExp node);
    void caseACastExp(ACastExp node);
    void caseACasttocharExp(ACasttocharExp node);
    void caseAIdExp(AIdExp node);
    void caseAThisExp(AThisExp node);
    void caseANewExp(ANewExp node);
    void caseACallExp(ACallExp node);
    void caseAIntconstExp(AIntconstExp node);
    void caseATrueExp(ATrueExp node);
    void caseAFalseExp(AFalseExp node);
    void caseACharconstExp(ACharconstExp node);
    void caseAStringconstExp(AStringconstExp node);
    void caseANullExp(ANullExp node);
    void caseAObjectReceiver(AObjectReceiver node);
    void caseASuperReceiver(ASuperReceiver node);

    void caseTAbstract(TAbstract node);
    void caseTBoolean(TBoolean node);
    void caseTBreak(TBreak node);
    void caseTByte(TByte node);
    void caseTCase(TCase node);
    void caseTCatch(TCatch node);
    void caseTChar(TChar node);
    void caseTClass(TClass node);
    void caseTConst(TConst node);
    void caseTContinue(TContinue node);
    void caseTDefault(TDefault node);
    void caseTDo(TDo node);
    void caseTDouble(TDouble node);
    void caseTElse(TElse node);
    void caseTExtends(TExtends node);
    void caseTExtern(TExtern node);
    void caseTFinal(TFinal node);
    void caseTFinally(TFinally node);
    void caseTFloat(TFloat node);
    void caseTFor(TFor node);
    void caseTGoto(TGoto node);
    void caseTIf(TIf node);
    void caseTImplements(TImplements node);
    void caseTImport(TImport node);
    void caseTIn(TIn node);
    void caseTInstanceof(TInstanceof node);
    void caseTInt(TInt node);
    void caseTInterface(TInterface node);
    void caseTLong(TLong node);
    void caseTMain(TMain node);
    void caseTNative(TNative node);
    void caseTNew(TNew node);
    void caseTPackage(TPackage node);
    void caseTPrivate(TPrivate node);
    void caseTProtected(TProtected node);
    void caseTPublic(TPublic node);
    void caseTReturn(TReturn node);
    void caseTShort(TShort node);
    void caseTStatic(TStatic node);
    void caseTSuper(TSuper node);
    void caseTSwitch(TSwitch node);
    void caseTSynchronized(TSynchronized node);
    void caseTThis(TThis node);
    void caseTThrow(TThrow node);
    void caseTThrows(TThrows node);
    void caseTTransient(TTransient node);
    void caseTTry(TTry node);
    void caseTVoid(TVoid node);
    void caseTVolatile(TVolatile node);
    void caseTWhile(TWhile node);
    void caseTAssign(TAssign node);
    void caseTGt(TGt node);
    void caseTLt(TLt node);
    void caseTNot(TNot node);
    void caseTEq(TEq node);
    void caseTLeq(TLeq node);
    void caseTGeq(TGeq node);
    void caseTNeq(TNeq node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTSemicolon(TSemicolon node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBracket(TLBracket node);
    void caseTRBracket(TRBracket node);
    void caseTComma(TComma node);
    void caseTDot(TDot node);
    void caseTInc(TInc node);
    void caseTNull(TNull node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTCharconst(TCharconst node);
    void caseTIntconst(TIntconst node);
    void caseTStringconst(TStringconst node);
    void caseTIdentifier(TIdentifier node);
    void caseTImportpath(TImportpath node);
    void caseTBlanks(TBlanks node);
    void caseTEolComment(TEolComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}