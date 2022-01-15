package processor;

import calculators.AbstractCalculator;
import calculators.Digit;

import java.lang.Integer;
import java.util.Arrays;

import digits.BinaryDigit;
import digits.DecimalDigit;
import digits.HexDigit;
import digits.OctDigit;

public class MathCalculator extends AbstractCalculator {

    public Digit add(Digit a, Digit b) {
        StringBuilder sb = new StringBuilder();

        if (isHex(a.toString()) == false || isHex(b.toString()) == false) {
            Integer parseFirstNumToHex = Integer.parseInt(a.toString(), 16);
            Integer parseSecondNumToHex = Integer.parseInt(b.toString(), 16);
            int sum = parseFirstNumToHex + parseSecondNumToHex;
            sb.append(sum);
            Digit convertToHex = new HexDigit(sb.toString());
            return convertToHex;
        }

        Integer firstNumberParse = Integer.parseInt(a.toString());
        Integer secondNumberParse = Integer.parseInt(b.toString());

        if (isBinaryNumber(firstNumberParse) && isDecimal(b.toString())) {
            String fromDecimalToBynary = Integer.toBinaryString(secondNumberParse);
            Long ToBinaryInt = Long.parseLong(fromDecimalToBynary);

            int c = 0, carryover = 0;
            int[] add = new int[20];
            while (firstNumberParse != 0 || ToBinaryInt != 0) {
                add[c++] = (int) ((firstNumberParse % 10 + ToBinaryInt % 10 + carryover) % 2);
                carryover = (int) ((firstNumberParse % 10 + ToBinaryInt % 10 + carryover) / 2);
                firstNumberParse = firstNumberParse / 10;
                ToBinaryInt = ToBinaryInt / 10;
            }
            if (carryover != 0) {
                sb.append(add[c++]);
                add[c++] = carryover;
            }
            --c;
            while (c >= 0) {
                sb.append(add[c--]);
            }
            Digit convertToBinary = new BinaryDigit(sb.toString());
            return convertToBinary;
        }


        if (isBinaryNumber(firstNumberParse) && isBinaryNumber(secondNumberParse)) {
            int c = 0, carryover = 0;
            int[] add = new int[10];
            while (firstNumberParse != 0 || secondNumberParse != 0) {
                add[c++] = (int) ((firstNumberParse % 10 + secondNumberParse % 10 + carryover) % 2);
                carryover = (int) ((firstNumberParse % 10 + secondNumberParse % 10 + carryover) / 2);
                firstNumberParse = firstNumberParse / 10;
                secondNumberParse = secondNumberParse / 10;
            }
            if (carryover != 0) {
                sb.append(add[c++]);
                add[c++] = carryover;
            }
            --c;
            while (c >= 0) {
                sb.append(add[c--]);
            }

            Digit convertToBinary = new BinaryDigit(sb.toString());
            return convertToBinary;
        } else if (isOctal(a.toString()) == true && isOctal(b.toString()) == true) {

            Integer secondNumberParseOctalNumber = Integer.parseInt(a.toString());
            Integer firstNumberParseOctalNumber = Integer.parseInt(b.toString());

            int sum = secondNumberParseOctalNumber + firstNumberParseOctalNumber;
            sb.append(sum);
            Digit convertToOctal = new OctDigit(sb.toString());
            return convertToOctal;
        } else if (isDecimal(a.toString()) && isDecimal(b.toString())) {

            int sum = firstNumberParse + secondNumberParse;
            sb.append(sum);
            Digit result = new DecimalDigit(sb.toString());
            return result;
        }
        return null;
    }


    public Digit sub(Digit a, Digit b) {
        StringBuilder sb = new StringBuilder();
        if (isHex(a.toString()) == false || isHex(b.toString()) == false) {
            Integer parseFirstNumToHex = Integer.parseInt(a.toString(), 16);
            Integer parseSecondNumToHex = Integer.parseInt(b.toString(), 16);
            int sum = parseFirstNumToHex - parseSecondNumToHex;
            sb.append(sum);
            Digit convertToHex = new HexDigit(sb.toString());
            return convertToHex;
        }

        Integer firstNumberParse = Integer.parseInt(a.toString());
        Integer secondNumberParse = Integer.parseInt(b.toString());


        if (isBinaryNumber(firstNumberParse) && isBinaryNumber(secondNumberParse)) {
            String res = subtract(a.toString(), b.toString());
            Digit finalResult = new BinaryDigit(res);
            return finalResult;
        }
        if (isBinaryNumber(firstNumberParse) && isDecimal(b.toString())) {
            int decimal = Integer.parseInt(a.toString(), 2);
            int result;
            if (decimal > secondNumberParse) {
                result = decimal - secondNumberParse;
            } else {
                result = secondNumberParse - decimal;
            }

            sb.append(result);
            Digit convertToDecimal = new DecimalDigit(sb.toString());
            return convertToDecimal;
        } else if (isOctal(a.toString()) == true && isOctal(b.toString()) == true) {

            Integer secondNumberParseOctalNumber = Integer.parseInt(a.toString());
            Integer firstNumberParseOctalNumber = Integer.parseInt(b.toString());
            int sum;
            if (firstNumberParseOctalNumber > secondNumberParseOctalNumber) {
                sum = firstNumberParseOctalNumber - secondNumberParseOctalNumber;
            } else {
                sum = secondNumberParse - firstNumberParse;
            }
            sb.append(sum);
            Digit convertToOctal = new OctDigit(sb.toString());
            return convertToOctal;
        } else if (isDecimal(a.toString()) && isDecimal(b.toString())) {
            int sum;
            if (firstNumberParse > secondNumberParse) {
                sum = firstNumberParse - secondNumberParse;
            } else {
                sum = secondNumberParse - firstNumberParse;
            }
            sb.append(sum);
            Digit result = new DecimalDigit(sb.toString());
            return result;
        }

        return null;
    }


    public Digit mul(Digit a, Digit b) {
        StringBuilder sb = new StringBuilder();
        if (isHex(a.toString()) == false || isHex(b.toString()) == false) {
            Integer parseFirstNumToHex = Integer.parseInt(a.toString(), 16);
            Integer parseSecondNumToHex = Integer.parseInt(b.toString(), 16);
            int sum = parseFirstNumToHex * parseSecondNumToHex;
            sb.append(sum);
            Digit convertToHex = new HexDigit(sb.toString());
            return convertToHex;
        }

        Integer firstNumberParse = Integer.parseInt(a.toString());
        Integer secondNumberParse = Integer.parseInt(b.toString());

        if (isBinaryNumber(firstNumberParse) && isDecimal(b.toString())) {
            String convertToBinaryString = Integer.toBinaryString(secondNumberParse);
            long binaryNumber = Long.parseLong(convertToBinaryString);
            long result = firstNumberParse * binaryNumber;
            sb.append(result);
            Digit convertToBinary = new BinaryDigit(sb.toString());
            return convertToBinary;
        }

        if (isBinaryNumber(firstNumberParse) && isBinaryNumber(secondNumberParse)) {
            String res = multiplyBinaryNumbers(a.toString(), b.toString());
            Digit finalResult = new BinaryDigit(res);
            return finalResult;

        } else if (isOctal(a.toString()) == true && isOctal(b.toString()) == true) {

            Integer secondNumberParseOctalNumber = Integer.parseInt(a.toString());
            Integer firstNumberParseOctalNumber = Integer.parseInt(b.toString());

            int sum = secondNumberParseOctalNumber * firstNumberParseOctalNumber;
            sb.append(sum);
            Digit convertToOctal = new OctDigit(sb.toString());
            return convertToOctal;

        } else if (isDecimal(a.toString()) && isDecimal(b.toString())) {
            int sum = firstNumberParse * secondNumberParse;
            sb.append(sum);
            Digit result = new DecimalDigit(sb.toString());
            return result;
        }
        return null;
    }

    public Digit div(Digit a, Digit b) {
        StringBuilder sb = new StringBuilder();
        if (isHex(a.toString()) == false || isHex(b.toString()) == false) {
            Integer parseFirstNumToHex = Integer.parseInt(a.toString(), 16);
            Integer parseSecondNumToHex = Integer.parseInt(b.toString(), 16);
            int sum = parseFirstNumToHex / parseSecondNumToHex;
            sb.append(sum);
            Digit convertToHex = new HexDigit(sb.toString());
            return convertToHex;
        }
        Integer firstNumberParse = Integer.parseInt(a.toString());
        Integer secondNumberParse = Integer.parseInt(b.toString());
        if (isBinaryNumber(firstNumberParse) && isBinaryNumber(secondNumberParse)) {
            String res = divideBinaryNumbers(a.toString(), b.toString());
            Digit finalResult = new BinaryDigit(res);
            return finalResult;
        }

        if (isBinaryNumber(firstNumberParse) && isDecimal(b.toString())) {
            int decimal = Integer.parseInt(a.toString(), 2);
            int result = secondNumberParse / decimal;
            sb.append(result);
            Digit convertToDecimal = new DecimalDigit(sb.toString());
            return convertToDecimal;

        } else if (isOctal(a.toString()) == true && isOctal(b.toString()) == true) {
            Integer secondNumberParseOctalNumber = Integer.parseInt(a.toString());
            Integer firstNumberParseOctalNumber = Integer.parseInt(b.toString());
            int sum;
            if (firstNumberParseOctalNumber > secondNumberParseOctalNumber) {
                sum = firstNumberParseOctalNumber / secondNumberParseOctalNumber;
            } else {
                sum = secondNumberParse / firstNumberParse;
            }
            sb.append(sum);
            Digit convertToOctal = new OctDigit(sb.toString());
            return convertToOctal;

        } else if (isDecimal(a.toString()) && isDecimal(b.toString())) {
            int sum;
            if (firstNumberParse > secondNumberParse) {
                sum = firstNumberParse / secondNumberParse;
            } else {
                sum = secondNumberParse / firstNumberParse;
            }
            sb.append(sum);
            Digit result = new DecimalDigit(sb.toString());
            return result;
        }

        return null;
    }

    @Override
    public Digit addMulti(Digit... collection) {
        StringBuilder sb = new StringBuilder();
        Digit binaryDigit = new BinaryDigit(collection[0].toString());
        Digit octDigit = new BinaryDigit(collection[1].toString());
        Digit decimalDigit = new BinaryDigit(collection[2].toString());
        Digit hexDigit = new BinaryDigit(collection[3].toString());

        int fromBinaryToDecimal = Integer.parseInt(binaryDigit.toString(), 2);
        int fromOctToDecimal = Integer.parseInt(octDigit.toString(), 8);
        int fromHexToDecimal = Integer.parseInt(hexDigit.toString(), 16);
        int decimal = Integer.parseInt(decimalDigit.toString());
        int result = fromBinaryToDecimal + fromOctToDecimal + fromHexToDecimal + decimal;
        sb.append(result);
        Digit totalResult = new DecimalDigit(sb.toString());

        return totalResult;
    }

    @Override
    public Digit subMulti(Digit... collection) {
        StringBuilder sb = new StringBuilder();
        Digit binaryDigit = new BinaryDigit(collection[0].toString());
        Digit octDigit = new BinaryDigit(collection[1].toString());
        Digit decimalDigit = new BinaryDigit(collection[2].toString());
        Digit hexDigit = new BinaryDigit(collection[3].toString());

        int fromBinaryToDecimal = Integer.parseInt(binaryDigit.toString(), 2);
        int fromOctToDecimal = Integer.parseInt(octDigit.toString(), 8);
        int fromHexToDecimal = Integer.parseInt(hexDigit.toString(), 16);
        int decimal = Integer.parseInt(decimalDigit.toString());
        int result = Math.abs(fromHexToDecimal - fromOctToDecimal - fromBinaryToDecimal - decimal);
        sb.append(result);
        Digit totalResult = new DecimalDigit(sb.toString());

        return totalResult;
    }

    @Override
    public Digit mulMulti(Digit... collection) {
        StringBuilder sb = new StringBuilder();
        Digit binaryDigit = new BinaryDigit(collection[0].toString());
        Digit octDigit = new BinaryDigit(collection[1].toString());
        Digit decimalDigit = new BinaryDigit(collection[2].toString());
        Digit hexDigit = new BinaryDigit(collection[3].toString());

        int fromBinaryToDecimal = Integer.parseInt(binaryDigit.toString(), 2);
        int fromOctToDecimal = Integer.parseInt(octDigit.toString(), 8);
        int fromHexToDecimal = Integer.parseInt(hexDigit.toString(), 16);
        int decimal = Integer.parseInt(decimalDigit.toString());
        int result = Math.abs(fromHexToDecimal * fromOctToDecimal * fromBinaryToDecimal * decimal);
        sb.append(result);
        Digit totalResult = new DecimalDigit(sb.toString());

        return totalResult;
    }

    @Override
    public Digit divMulti(Digit... collection) {
        StringBuilder sb = new StringBuilder();
        Digit binaryDigit = new BinaryDigit(collection[0].toString());
        Digit octDigit = new BinaryDigit(collection[1].toString());
        Digit decimalDigit = new BinaryDigit(collection[2].toString());
        Digit hexDigit = new BinaryDigit(collection[3].toString());

        int fromBinaryToDecimal = Integer.parseInt(binaryDigit.toString(), 2);
        int fromOctToDecimal = Integer.parseInt(octDigit.toString(), 8);
        int fromHexToDecimal = Integer.parseInt(hexDigit.toString(), 16);
        int decimal = Integer.parseInt(decimalDigit.toString());
        int result = Math.abs(fromHexToDecimal / fromOctToDecimal / fromBinaryToDecimal / decimal);
        sb.append(result);
        Digit totalResult = new DecimalDigit(sb.toString());

        return totalResult;
    }


    /**
     * Визуализирира числото, във формата към който принадлежи
     * •	BinaryDigit – двоично
     * •	OctDigit - осмично
     * •	DecimalDigit – десетично
     * •	HexDigit – шестнаисетично
     * <p>
     * #Пример:
     * BinaryDigit a = new BinaryDigit(“0101”);
     * MathCalculator calculator = new MathCalculator();
     * calculator.nativeRender(a) // 0101
     *
     * @param digit
     */
    public void renderNative(Digit digit) {

        System.out.println("Резултат от операцията:" + digit);

    }

    /**
     * Визуализира числото в десетичен формат
     * <p>
     * Пример:
     * BinaryDigit a = new BinaryDigit(“0101”);
     * MathCalculator calculator = new MathCalculator();
     * calculator.decimalRender(a) // 5
     *
     * @param
     */
    public void renderDecimal(Digit addResult) {
        try {
            int decimal = Integer.parseInt(addResult.toString(), 2);
            System.out.println(" числото в десетичен вид:" + decimal);
        } catch (Exception e) {
            System.out.println(" числото в десетичен вид:" + addResult);
        }
        System.out.println();
    }

    /**
     * Визуализира числото в двуичен формат
     *
     * @param digit
     */
    public void renderBinary(Digit digit) {
        int parsedNumber = Integer.parseInt(digit.toString());
        System.out.println("Числото в двуичен вид: " + Integer.toBinaryString(parsedNumber));
        System.out.println();
    }

    /**
     * Визуализира числото в осмичен формат
     *
     * @param digit
     */
    public void renderOct(Digit digit) {
        long parsedNumber = Long.parseLong(digit.toString());
        System.out.println("Числото в осмичен вид:" + Long.toOctalString(parsedNumber));
        System.out.println();
    }

    /**
     * Визуализира числото в шестнадесетичен формат
     *
     * @param digit
     */
    public void renderHex(Digit digit) {
        int parsedNumber = Integer.parseInt(digit.toString());
        System.out.println(" Числото в шестнаисетичен вид:" + Integer.toHexString(parsedNumber));
        System.out.println();
    }

    boolean isHex(String str) {
        int test = 0;
        try {
            test = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public boolean isDecimal(String s) {
        Boolean ReturnValue;
        try {
            Integer.valueOf(s);
            ReturnValue = true;
        } catch (Exception e) {
            ReturnValue = false;
        }
        return ReturnValue;
    }

    public static boolean isOctal(String octal) {

        boolean isOctal = false;

        if (octal != null && !octal.isEmpty()) {
            int number = Integer.parseInt(octal);

            while (number > 0) {
                if (number % 10 <= 7) {
                    isOctal = true;
                } else {
                    isOctal = false;
                    break;
                }
                number /= 10;
            }
        }
        return isOctal;
    }

    public boolean isBinaryNumber(int binary) {

        boolean status = true;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int tmp = binary % 10;
                if (tmp > 1) {
                    status = false;
                    break;
                }
                binary = binary / 10;
            }
        }
        return status;
    }

    public static String subtract(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 - b2;
        return Integer.toBinaryString(sum);
    }

    public static String multiplyBinaryNumbers(String binaryNum1, String binaryNum2) {
        int num1 = Integer.parseInt(binaryNum1, 2);
        int num2 = Integer.parseInt(binaryNum2, 2);
        int product = num1 * num2;
        return Integer.toBinaryString(product);
    }

    public static String divideBinaryNumbers(String binaryNum1, String binaryNum2) {
        int num1 = Integer.parseInt(binaryNum1, 2);
        int num2 = Integer.parseInt(binaryNum2, 2);
        int product = num1 / num2;
        return Integer.toBinaryString(product);
    }
}




