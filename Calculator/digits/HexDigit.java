package digits;

import calculators.Digit;

public class HexDigit extends Digit {

    public HexDigit(String digit) {
        super(digit);
    }


    @Override
    public String toString() {
        return digit;
    }
}
