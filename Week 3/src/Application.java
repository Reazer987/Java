import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

<<<<<<< HEAD

=======
>>>>>>> 2ec727e6a015858316108127fcfeb9c1a708ec2e
public class Application {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Генерирайте число между 1 и 10");
        int biosRandomNum = scanner.nextInt();

<<<<<<< HEAD
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
=======
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
>>>>>>> 2ec727e6a015858316108127fcfeb9c1a708ec2e

        Random random = new Random();
        int max = 100;
        int min = 1;
<<<<<<< HEAD
        int tempEmotion = min + random.nextInt(max); // ako se precaka neshto !!!!!!!!
=======
         int tempEmotion = min + random.nextInt(max); // ako se precaka neshto !!!!!!!!
>>>>>>> 2ec727e6a015858316108127fcfeb9c1a708ec2e

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
<<<<<<< HEAD
            }

        }
        int max2 = 100;
        int min2 = 1;
        int step = min + random.nextInt(max);

        if (step>=1 && step<=10){
            System.out.println("Стъпка:" + step);


    }
        else if(step>=2 && step<=100){
            System.out.println("Стъпка:" + step);
        }
        else if(step>=1 && step<=15){
            System.out.println("Стъпка:" + step);
        }
        else if(step>=1 && step<=65){
            System.out.println("Стъпка:" + step);
        }

        System.out.println("Изберете една от посочените емоции : Трагедия,  Продуктивна работа , Хаос , Положителна емоция, Депресия");
        String emotionType = scanner.next().toUpperCase(Locale.ROOT);

        switch (emotionType){
            case "ТРАГЕДИЯ":
                System. out.println("Животът не струва");
                break;
            case "ПРОДУКТИВНА РАБОТА":
                System. out.println("Разбий ги!");
                break;
            case "ХАОС":
                System. out.println("Невежеството е благодат");
                break;
            case "ПОЛОЖИТЕЛНА ЕМОЦИЯ":
                System. out.println("Давай ти си! ");
                break;
            case "ДЕПРЕСИЯ":
                System. out.println("Oбичам те!");
                break;
        }

        if (emotion=="+"){
            int min3 = 1;
            int max3 = 6;
            int randomNum1 = min3 + random.nextInt(max3);
            int randomNum2 = min3 + random.nextInt(max3);
            int randomNum3 = min3 + random.nextInt(max3);

            if (randomNum1+randomNum2+randomNum3>=step){

            }
        }
        if (emotionType =="ДЕПРЕСИЯ"){
            System.out.println("Kak си");
            String robotAnswer = scanner.next();

            if (robotAnswer.equals("Добре съм")){
                System.out.println("Хайде да работим");
            }
            else {
                System.out.println("Не ми се живее");
                int salaryIncrease = scanner.nextInt();

            }
        }
        System.out.println("Сбогом жесток свят");


    }
}
=======
        }

        }




    }
}
>>>>>>> 2ec727e6a015858316108127fcfeb9c1a708ec2e
