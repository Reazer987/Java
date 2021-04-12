public class Аpplication {

    public static void main (String[]args){
        int faklutetNumber = 2001261001;
        String firstAndSecondName = "Teдор Вълчев";
        System.out.println("Моята факлутетен номер е " + faklutetNumber);
        System.out.println("Казвам се " + firstAndSecondName);

        int metalSwords = 15;
        int armour = 10;
        int pistol = 1;
        int woodenTank = 1;
        int plasticBidon = 1;
        double bagFullOfFakeMoney = 169.77;
        String [] serialNumbers = {"M","B","P","T","B","С"};
        String firstArticul = serialNumbers[0]+6;
        String secondArticul = serialNumbers[1]+5;
        String thirdArticul = serialNumbers[2]+8;
        String fourthArticul = serialNumbers[3]+4;
        String fifthArticul = serialNumbers[4]+5;
        String sixthArticul = serialNumbers[5]+3;

        String [] Qualitys = {"Mетални","Алуминиеви","Газов","Дървен","Пластмасов","Кожен"};
        String qualityOne = Qualitys[0];
        String qualityTwo = Qualitys[1];
        String qualityThree = Qualitys[2];
        String qualityFour = Qualitys[3];
        String qualityFive = Qualitys[4];
        String qualitySix = Qualitys[5];


        for (int i = 0 ; i< serialNumbers.length;i++){
            String currentItem = serialNumbers[i];
            System.out.print(currentItem + " ");

        }
        for (int i = 0 ; i< Qualitys.length;i++){
            String currentItem = Qualitys[i];
            System.out.print(currentItem + " ");

        }

        String forSureIWantToSuccessfullyGraduate;

    }
}
