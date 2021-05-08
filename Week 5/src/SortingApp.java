import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

public class SortingApp {
    public static void main(String[] args) {

        System.out.println("Въведете колко на брой числа ще въвеждате.");
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

        int[] sortingNumbers = new int[numberCount];
        int[] input = sortingNumbers.clone(); // това е за да мога да визуализирам въведеният масив в 11 подточка

        for (int i = 0; i < sortingNumbers.length; i++) {
            sortingNumbers[i] = scanner.nextInt();
            input[i] = sortingNumbers[i]; // това е за да мога да визуализирам въведеният масив в 11 подточка


            if (sortingNumbers[i] < 0 || sortingNumbers[i] > 100) {
                System.out.println("Числата трябва да са между 0 и 100");
                return;
            }


        }

        while (true) {
            System.out.println("Меню с опции: ");
            System.out.println("1.Сортиране на въведените числа във възходящ ред ");
            System.out.println("2.Сортиране на въведените числа в низходящ ред ");
            System.out.println("3.Търсене на позиция на конкретно ");
            System.out.println("4.Разбъркване на числата ");
            System.out.println("5.Изчисляване на сбора на всички числа  ");
            System.out.println("6.Намиране на най-голямото число  ");
            System.out.println("7.Намиране на най-малкото число ");
            System.out.println("8.Намиране средно-аритметично на числата ");
            System.out.println("9.Проверка за симетричност на масива от числа ");
            System.out.println("10.Обръщане на масива от числа ");
            System.out.println("11.Визуализирай въведените числа ");
            System.out.println("12.Изход ");
            System.out.println("Изберете число за да активирате командата");

            int menu = scanner.nextInt();

            if (menu == 1) {


                for (int i = 0; i < sortingNumbers.length; i++) {
                    for (int m = i + 1; m < sortingNumbers.length; m++) {

                        if (sortingNumbers[i] > sortingNumbers[m]) {
                            int tem = sortingNumbers[i];
                            sortingNumbers[i] = sortingNumbers[m];
                            sortingNumbers[m] = tem;
                        }

                    }

                }

                for (int i = 0; i < sortingNumbers.length; i++) {
                    System.out.println(sortingNumbers[i]);
                }

            } else if (menu == 2) {
                for (int i = 0; i < sortingNumbers.length; i++) {
                    for (int m = i + 1; m < sortingNumbers.length; m++) {

                        if (sortingNumbers[i] < sortingNumbers[m]) {
                            int tem = sortingNumbers[i];
                            sortingNumbers[i] = sortingNumbers[m];
                            sortingNumbers[m] = tem;
                        }

                    }

                }
                for (int i = 0; i < sortingNumbers.length; i++) {
                    System.out.println(sortingNumbers[i]);
                }

            } else if (menu == 3) {
                System.out.println("Въведете числото, чиято позиция искате да намерите.");
                int number = scanner.nextInt();

                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    int currentNum = sortingNumbers[i];
                    if (number == currentNum) {
                        System.out.println("Числото" + " " + number + " " + "е намерено на позиция" + " " + i + ".");
                        break;

                    } else {
                        System.out.println("Числото" + " " + number + " " + " не е намерено.");

                    }

                }


            } else if (menu == 4) {
                Random random = new Random();

                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    int randomPosition = random.nextInt(sortingNumbers.length);
                    int temp = sortingNumbers[i];
                    sortingNumbers[i] = sortingNumbers[randomPosition];
                    sortingNumbers[randomPosition] = temp;

                }
                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    System.out.println(sortingNumbers[i]);
                }

            } else if (menu == 5) {

                int sum = 0;
                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    sum += sortingNumbers[i];
                }
                System.out.println("Сумата е:" + " " + sum);

            } else if (menu == 6) {
                int maxNum = 0;

                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    for (int m = i + 1; m <= sortingNumbers.length - 1; m++) {
                        int currentNum = sortingNumbers[i];
                        int nextNumber = sortingNumbers[m];

                        if (currentNum >= nextNumber) {
                            maxNum = currentNum;
                        }

                    }
                }

                System.out.println("Най голямото число е" + " " + maxNum);

            } else if (menu == 7) {
                int minNum = 0;

                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    for (int m = i + 1; m <= sortingNumbers.length - 1; m++) {
                        int currentNum = sortingNumbers[i];
                        int nextNumber = sortingNumbers[m];

                        if (currentNum <= nextNumber) {
                            minNum = currentNum;
                        }

                    }
                }

                System.out.println("Най малкото число е" + " " + minNum);

            } else if (menu == 8) {

                int sum = 0;
                int count = 0;

                for (int i = 0; i <= sortingNumbers.length - 1; i++) {
                    sum += sortingNumbers[i];
                    count += i;

                }

                System.out.println("Средно аритметично:" + " " + sum / count);


            } else if (menu == 9) {
                int length = sortingNumbers.length;
                for (int i = 0; i < length / 2; i++) {
                    if (sortingNumbers[i] != sortingNumbers[length - i - 1]) {
                        System.out.println("Масивът не е симетричен");
                    } else {
                        System.out.println("Масивът  е симетричен");
                    }

                }
            } else if (menu == 10) {

                for (int i = sortingNumbers.length - 1; i >= 0; i--) {
                    System.out.println(sortingNumbers[i]);

                }


            } else if (menu == 11) {


                for (int i = 0; i <= input.length - 1; i++) {
                    System.out.println(input[i]);

                }
            } else if (menu == 12) {
                break;
            }
        }
    }
}







