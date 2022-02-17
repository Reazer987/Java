import Absraction.BasicAnimal;
import Absraction.FightAnimal;
import Absraction.FoodAnimal;
import Absraction.TransportAnimal;
import Basic_Animals.Camel;
import Basic_Animals.Cock;
import Enums.FoodType;
import Enums.State;
import Fight_Animals.Fight_Cock;
import Fight_Animals.Fight_Horse;
import Food_Animals.Delicious_Camel;
import Transport_Animals.Fast_Sheep;
import tests.*;

import java.lang.reflect.AnnotatedArrayType;

public class main {

    public static void main(String[] args){
        //РАЗКОМЕНТИРАЙТЕ ТЕСТОВЕТЕ ЕДИН ПО ЕДИН ЗА ДА ТРЪГНАТ
        Test_1 test_1 = new Test_1();
        //test_1.animalCreateFromTypeBasic();
        //test_1.animalCreateFromTypeFight();
        //test_1.animalCreateFromTypeFood();
        //test_1.animalCreateFromTypeTransport();

        Test_2 test_2 = new Test_2();
        //test_2.animalEvoluteToFightTypeFromBasicCock(FoodType.FIGHT_FOOD);
        //test_2.animalEvoluteToFightTypeFromBasicCow(FoodType.FIGHT_FOOD);
        //test_2.animalEvoluteToFightTypeFromBasicDog(FoodType.FIGHT_FOOD);
       // test_2.animalEvoluteToFightTypeFromBasicHorse(FoodType.FIGHT_FOOD);
       // test_2.animalEvoluteToFightTypeFromBasicSCamel(FoodType.FIGHT_FOOD);
       // test_2.animalEvoluteToFightTypeFromBasicSheep(FoodType.FIGHT_FOOD);

        Test_3 test_3 = new Test_3();
        //test_3.animalEvoluteFromFoodTypeToFightTypeCow(FoodType.NORMAL_FOOD);
        //test_3.animalEvoluteFromFoodTypeToFightTypeCamel(FoodType.NORMAL_FOOD);
        //test_3.animalEvoluteFromFoodTypeToFightTypeCock(FoodType.NORMAL_FOOD);
        //test_3.animalEvoluteFromFoodTypeToFightTypeDog(FoodType.NORMAL_FOOD);
        //test_3.animalEvoluteFromFoodTypeToFightTypeHorse(FoodType.NORMAL_FOOD);
        //test_3.animalEvoluteFromFoodTypeToFightTypeSheep(FoodType.NORMAL_FOOD);

        SpecialTest_1 specialTest_1 = new SpecialTest_1();
        //specialTest_1.tryToFeedSleepingAnimal(FoodType.FIGHT_FOOD);
        //specialTest_1.tryToFeedSleepingAnimal(FoodType.FIGHT_FOOD);
        //specialTest_1.tryToFeedSleepingAnimal(FoodType.FIGHT_FOOD);

        SpecialTest_2 specialTest_2 = new SpecialTest_2();
        //specialTest_2.transformFromFightAnimalToNormal();
        //specialTest_2.transformFromFightAnimalToNormal();
        //specialTest_2.transformFromFightAnimalToNormal();
        //specialTest_2.transformFromFightAnimalToNormal();
    }

}
