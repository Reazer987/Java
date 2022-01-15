
package tests;

import calculators.AbstractCalculator;
import calculators.Digit;
import digits.BinaryDigit;
import processor.MathCalculator;

public class BinaryOperationsTest {

    public static void test(AbstractCalculator calculator) {
        BinaryDigit a = new BinaryDigit("1101");
        BinaryDigit b = new BinaryDigit("0001");
        //тук единственно каствам за да се получи binary
        // също така съм подал променливите като addResult subResult на съответните методи във всички класове

        BinaryDigit addResult = (BinaryDigit) calculator.add(a, b);
        calculator.renderNative(addResult);
        calculator.renderDecimal(addResult);

        BinaryDigit subResult = (BinaryDigit) calculator.sub(a, b);//subresult
        calculator.renderNative(subResult);
        calculator.renderDecimal(subResult);

        BinaryDigit mulResult = (BinaryDigit) calculator.mul(a, b);
        calculator.renderNative(mulResult); //mulResult
        calculator.renderDecimal(mulResult);

        BinaryDigit divResult = (BinaryDigit) calculator.div(a, b);
        calculator.renderNative(divResult);//
        calculator.renderDecimal(divResult);

    }
}
