package tests;

import Absraction.Animal;
import Absraction.BasicAnimal;
import Absraction.FightAnimal;
import Absraction.FoodAnimal;
import Basic_Animals.*;
import Enums.FoodType;
import Enums.State;
import Fight_Animals.*;

public class Test_2 {


    public  void  animalEvoluteToFightTypeFromBasicDog(FoodType foodType){
        Animal dog = new Dog(State.AWAKE);
        System.out.println("Преди трансформацията");
       System.out.println(dog.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
             dog = new Fight_Dog(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(dog.toString());
              ((Fight_Dog) dog).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(dog.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }

    public  void  animalEvoluteToFightTypeFromBasicCow(FoodType foodType){
        Animal cow = new Cow(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(cow.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
            cow = new Horned_Cow(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(cow.toString());
            ((Horned_Cow) cow).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(cow.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteToFightTypeFromBasicCock(FoodType foodType){
        Animal cock = new Cock(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(cock.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
            cock = new Fight_Cock(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(cock.toString());
            ((Fight_Cock) cock).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(cock.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteToFightTypeFromBasicHorse(FoodType foodType){
        Animal horse = new Horse(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(horse.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
            horse = new Fight_Horse(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(horse.toString());
            ((Fight_Horse) horse).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(horse.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteToFightTypeFromBasicSheep(FoodType foodType){
        Animal sheep = new Sheep(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(sheep.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
            sheep = new Fight_Sheep(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(sheep.toString());
            ((Fight_Sheep) sheep).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(sheep.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteToFightTypeFromBasicSCamel(FoodType foodType){
        Animal camel = new Camel(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(camel.toString());

        if (FoodType.FIGHT_FOOD.equals(foodType)){
            camel = new Spitting_Camel(State.AWAKE);
            System.out.println("Преди специалната способност:");
            System.out.print(camel.toString());
            ((Spitting_Camel) camel).aggressionUpdate();
            System.out.println("След специалната способност:");
            System.out.print(camel.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }




}
