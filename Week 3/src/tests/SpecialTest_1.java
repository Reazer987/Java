package tests;
import Absraction.Animal;
import Basic_Animals.Dog;
import Enums.FoodType;
import Enums.State;
import Fight_Animals.Fight_Dog;
import Food_Animals.Vietnam_Dog;
import Transport_Animals.Harnessed_Dog;

import java.util.Scanner;

public class SpecialTest_1 {
public  static  int count = 0;
    public  void tryToFeedSleepingAnimal( FoodType type){
        Animal dog = new Dog(State.SLEEP);
        System.out.println(dog.toString());
        count++;
        System.out.println("Oпит за нахранване на спящото животно:"+count);
            if (count == 3) {
                count = 0;
                if(type.equals(FoodType.FIGHT_FOOD)){
                    dog = new Fight_Dog(State.AWAKE);
                }
                else if(type.equals(FoodType.NORMAL_FOOD)){
                    dog = new Vietnam_Dog(State.AWAKE);
                }
                else if(type.equals(FoodType.TRANSPORT_FOOD)){
                    dog = new Harnessed_Dog(State.AWAKE);
                }
                else{
                    System.out.println("Невалидна храна");
                }
                System.out.println(dog.toString());
            }

    }

}
