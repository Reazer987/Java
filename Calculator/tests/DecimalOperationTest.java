package tests;

import calculators.AbstractCalculator;
import calculators.Digit;
import digits.BinaryDigit;
import digits.DecimalDigit;

public class DecimalOperationTest {

    public static void test(AbstractCalculator calculator) {

        Digit a = new DecimalDigit("105");
        Digit b = new DecimalDigit("240");

        Digit addResult = calculator.add(a, b);
        calculator.renderNative(addResult);
        calculator.renderHex(addResult);

        Digit subResult = calculator.sub(a, b);
        calculator.renderNative(subResult);
        calculator.renderHex(subResult);

        Digit mulResult = calculator.mul(a, b);
        calculator.renderNative(mulResult);
        calculator.renderHex(mulResult);

        Digit divResult = calculator.div(a, b);
        calculator.renderNative(divResult);
        calculator.renderHex(divResult);


    }
}
