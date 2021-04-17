import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int myNumber = 487276;
        System.out.println("Здравейте, честит празник.");
        System.out.println("Моля въведете номера на вашата персонална идентификационна карта: " + myNumber);

        boolean isNumberExactlySixDigits =
                ((myNumber > 100_000) || (myNumber == 100_000)) &&
                        ((myNumber < 999_999) || (myNumber == 999_999));
        boolean isMoreThanSix = (myNumber > 999_999);
        boolean isMoreThanTwo = (myNumber > 99);


        if (isNumberExactlySixDigits) {
            System.out.println("NORMAL");
            System.out.println("Радваме се, че нормални хора вече гласуват");
        } else if (isMoreThanSix) {
            System.out.println("RICH");
            System.out.println("Има за нас, има и за вас");
        } else if (isMoreThanTwo) {
            System.out.println("POOR");
            System.out.println("Хайде по-бързо и да те няма");
        }

        int isBeforeLastDigitGraterThanTree = (myNumber % 100) / 10;

        if (isBeforeLastDigitGraterThanTree > 3) { // Тук проверявам дали клиента е VIP
            System.out.println("Кои искате да бъдат вашите бъдещи господари? ");
            Scanner input = new Scanner(System.in);
            int chooseNumber = input.nextInt();

            if (chooseNumber == 1) {
                System.out.println("Вие си поръчахте да ви управлява " + "Партия за прогресивен канибализъм ");
            } else if (chooseNumber == 27) {
                System.out.println("Вие си поръчахте да ви управлява " + "Замундска вегетарианска партия");
            } else if (chooseNumber == 666) {
                System.out.println("Вие си поръчахте да ви управлява " + "Синдикат на вуду-трактористите ");
            } else if (chooseNumber == 999) {
                System.out.println("Вие си поръчахте да ви управлява " + "Партия на труда, мотиката и наковалнята ");
            }

            System.out.println("Укривате ли данъци? ");
            Scanner text = new Scanner(System.in);
            String choose = text.next();

            switch (choose) {
                case "N":
                    System.out.println("Будала");
                    break;
                case "Y":
                    System.out.println("Браво моето момче");
                    break;
            }

            System.out.println("Колега, искате ли баничка? ");
            String yesOrNo = text.next();

            switch (yesOrNo) {
                case "N":
                    System.out.println("Ами, то и без това няма");
                    break;
                case "Y":
                    System.out.println("Не може");
                    break;
            }
            System.out.println("И все пак всеки има право на лош вкус, моля депозирайте такса от един банан на изхода. ");
            System.out.println("Поздрав с песента Сандокан на Лолуги ");


        }


    }


}

