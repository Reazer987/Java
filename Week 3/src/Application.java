import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Application {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Генерирайте число между 1 и 10");
        int biosRandomNum = scanner.nextInt();

         while (biosRandomNum<1 || biosRandomNum>10){
             System.out.println("Опитай пак");
             biosRandomNum= scanner.nextInt();

         }

         System.out.println("Изберете емоция : + или - ");
        String emotion = scanner.next();


         if (biosRandomNum%2 == 0 ){

      switch (emotion){
          case "+" : System.out.println("Продуктивност");

          break;
          case "-" : System.out.println("Трагедия");

              break;

      }

         }
         else { switch (emotion) {
             case "+":
                 System.out.println("Дружелюбност");
                 break;
             case "-":
                 System.out.println("Хаос");
                 break;
         }

         }

        Random random = new Random();
        int max = 100;
        int min = 1;
         int tempEmotion = min + random.nextInt(max); // ako se precaka neshto !!!!!!!!

        if (tempEmotion >= 60 && tempEmotion<= 80 && tempEmotion % 3 == 0 ){
            System.out.println("Активиране на негативна емоция ");


        }
        else if (tempEmotion >= 5 && tempEmotion<= 55 && tempEmotion % 5 == 0 ){
            System.out.println("Активиране на  положителна  емоция ");
        }

        else {
            System.out.println("Изберете една от посочените емоции : Трагедия,  Продуктивна работа , Хаос , Положителна емоция, Депресия");
            String emotionType = scanner.next().toUpperCase(Locale.ROOT);

            switch (emotionType){
                case "ТРАГЕДИЯ":
                    System. out.println("Сега стана страшно");
                    break;
                case "ПРОДУКТИВНА РАБОТА":
                    System. out.println("Работа, работа, работа");
                    break;
                case "ХАОС":
                    System. out.println("Време е да унищожим всички човеци");
                    break;
                case "ПОЛОЖИТЕЛНА ЕМОЦИЯ":
                    System. out.println("Прекрасен ден птичките пеят ");
                    break;
                case "ДЕПРЕСИЯ":
                    System. out.println("Трудно е да си робот :(");
                    break;
        }

        }




    }
}
