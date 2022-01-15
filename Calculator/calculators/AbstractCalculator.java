package calculators;

import digits.BinaryDigit;

public abstract class AbstractCalculator {

    public abstract Digit add(Digit a, Digit b);
    public abstract Digit addMulti(Digit ...collection);
    public abstract Digit sub(Digit a, Digit b);
    public abstract Digit subMulti(Digit ...collection);
    public abstract Digit mul(Digit a, Digit b);
    public abstract Digit mulMulti(Digit ...collection);

    public abstract Digit div(Digit a, Digit b);
    public abstract Digit divMulti(Digit ...collection);

    public abstract void renderNative(Digit addResult);

    public abstract void renderDecimal(Digit addResult);

    public abstract void renderHex(Digit addResult);


    public abstract void renderBinary(Digit addResult);

    public abstract void renderOct(Digit addResult);
}
