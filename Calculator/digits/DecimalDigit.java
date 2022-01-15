package digits;

import calculators.Digit;

public class DecimalDigit extends Digit {
    public DecimalDigit(String digit) {
        super(digit);
    }

    @Override
    public String toString() {
        return digit;
    }
}
