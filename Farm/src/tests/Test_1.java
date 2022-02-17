package tests;

import Absraction.BasicAnimal;
import Absraction.FightAnimal;
import Absraction.FoodAnimal;
import Absraction.TransportAnimal;
import Basic_Animals.Cow;
import Enums.State;
import Fight_Animals.Fight_Sheep;
import Fight_Animals.Horned_Cow;
import Food_Animals.Vietnam_Dog;
import Transport_Animals.TwoBackedCamel;

public class Test_1 {

public  void animalCreateFromTypeBasic(){
    BasicAnimal cow = new Cow(State.AWAKE);
   System.out.print(cow.toString());
   cow.makeSound();
}
    public  void animalCreateFromTypeFight(){
        FightAnimal sheep = new Fight_Sheep(State.AWAKE);
        System.out.println("Преди специалната способност:");
       System.out.print(sheep.toString());
        sheep.aggressionUpdate();
        System.out.println("След специалната способност:");
        System.out.print(sheep.toString());
    }
    public  void animalCreateFromTypeFood(){
        FoodAnimal dog = new Vietnam_Dog(State.AWAKE);
        System.out.println("Преди специалната способност:");
        System.out.print(dog.toString());
        dog.feed();
        System.out.println("След специалната способност:");
        System.out.print(dog.toString());
    }
    public  void animalCreateFromTypeTransport(){
        TransportAnimal camel = new TwoBackedCamel(State.AWAKE);
        System.out.println("Преди специалната способност:");
        System.out.print(camel.toString());
        camel.speedIncrease();
        System.out.println("След специалната способност:");
        System.out.print(camel.toString());
    }




}
