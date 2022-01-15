package digits;

import calculators.Digit;

public class BinaryDigit extends Digit {
    public BinaryDigit(String digit) {
        super(digit);
    }

    @Override
    public String toString() {
        return digit;
    }
}
