package tests;

import calculators.AbstractCalculator;
import calculators.Digit;
import digits.DecimalDigit;
import digits.OctDigit;

public class OctOperationTest {

    public static void test(AbstractCalculator calculator) {

        Digit a = new OctDigit("531");
        Digit b = new OctDigit("67");

        Digit addResult = calculator.add(a, b);
        calculator.renderNative(addResult);
        calculator.renderBinary(addResult);

        Digit subResult = calculator.sub(a, b);
        calculator.renderNative(subResult);
        calculator.renderOct(subResult);

        Digit mulResult = calculator.mul(a, b);
        calculator.renderNative(mulResult);
        calculator.renderDecimal(mulResult);

        Digit divResult = calculator.div(a, b);
        calculator.renderNative(divResult);
        calculator.renderHex(divResult);


    }
}
