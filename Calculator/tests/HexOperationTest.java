package tests;

import calculators.AbstractCalculator;
import calculators.Digit;
import digits.OctDigit;

public class HexOperationTest {

    public static void test(AbstractCalculator calculator) {

        Digit a = new OctDigit("1A47B");
        Digit b = new OctDigit("67");

        Digit addResult = calculator.add(a, b);
        calculator.renderNative(addResult);
        calculator.renderBinary(addResult);

        Digit subResult = calculator.sub(a, b);//addResult
        calculator.renderNative(subResult);
        calculator.renderOct(subResult);

        Digit mulResult = calculator.mul(a, b);//addResult
        calculator.renderNative(mulResult);
        calculator.renderDecimal(mulResult);

        Digit divResult = calculator.div(a, b);//addResult
        calculator.renderNative(divResult);
        calculator.renderHex(divResult);


    }
}
