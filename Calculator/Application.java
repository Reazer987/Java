import digits.BinaryDigit;
import digits.DecimalDigit;
import digits.HexDigit;
import processor.MathCalculator;
import tests.*;

public class Application {

    public static void main(String[] args){

        MathCalculator calculator = new MathCalculator();

//      Тест 1 - Операции с бинарни числа
//      ==================================================
        BinaryOperationsTest.test(calculator); // BinaryOperationsTest

//      Тест 2 - Операции с осмични числа
//      ==================================================
        DecimalOperationTest.test(calculator);

//      Тест 3 - Операции с осмични числа
//      ==================================================
        HexOperationTest.test(calculator); //DecimalOperation

//      Тест 4 - Операции с шестнаисетични числа
//      ==================================================
        OctOperationTest.test(calculator); //DecimalOperation

//      Тест 5 - Операции с числа в различни формати
//      ==================================================
        MixOperationTest.test(calculator);

//      Тест 6 - Операции с много числа
//      ==================================================
        MultiOperationTest.test(calculator);
    }
}