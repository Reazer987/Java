package tests;

import Absraction.Animal;
import Absraction.BasicAnimal;
import Absraction.FightAnimal;
import Basic_Animals.Horse;
import Enums.State;
import Fight_Animals.Fight_Horse;


public class SpecialTest_2 {
    public static int count = 0 ;

    public  void transformFromFightAnimalToNormal(){
        Animal horse = new Fight_Horse(State.AWAKE);
        System.out.println(horse.toString());
        ((Fight_Horse) horse).aggressionUpdate();
        count++;
        System.out.println("Използване на способноста:" + count);
        if (count>3){
            System.out.println("Нулиране на способностите");
           horse = new Horse(State.AWAKE);
           horse.weight = 0;
           horse.speed = 0;
           horse.aggression = 0;
           horse.energy = 0;
           System.out.println(horse.toString());
           count = 0;

        }
    }

}
