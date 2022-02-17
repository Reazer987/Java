package tests;

import Absraction.Animal;
import Basic_Animals.*;
import Enums.FoodType;
import Enums.State;
import Fight_Animals.*;
import Food_Animals.*;

public class Test_3 {

    public  void  animalEvoluteFromFoodTypeToFightTypeCow(FoodType foodType){
        Animal cow = new Cow(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(cow.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            cow = new Milk_Cow(State.AWAKE);
            System.out.print(cow.toString());
            cow = new Horned_Cow(State.AWAKE);
            System.out.print(cow.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteFromFoodTypeToFightTypeCamel(FoodType foodType){
        Animal camel = new Camel(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(camel.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            camel = new Delicious_Camel(State.AWAKE);
            System.out.print(camel.toString());
            camel = new Spitting_Camel(State.AWAKE);
            System.out.print(camel.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteFromFoodTypeToFightTypeSheep(FoodType foodType){
        Animal sheep = new Sheep(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(sheep.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            sheep = new Milk_Sheep(State.AWAKE);
            System.out.print(sheep.toString());
            sheep = new Fight_Sheep(State.AWAKE);
            System.out.print(sheep.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteFromFoodTypeToFightTypeHorse(FoodType foodType){
        Animal horse = new Horse(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(horse.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            horse = new Fat_Horse(State.AWAKE);
            System.out.print(horse.toString());
            horse = new Fight_Horse(State.AWAKE);
            System.out.print(horse.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }
    public  void  animalEvoluteFromFoodTypeToFightTypeDog(FoodType foodType){
        Animal dog = new Dog(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(dog.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            dog = new Vietnam_Dog(State.AWAKE);
            System.out.print(dog.toString());
            dog = new Fight_Dog(State.AWAKE);
            System.out.print(dog.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }

    public  void  animalEvoluteFromFoodTypeToFightTypeCock(FoodType foodType){
        Animal cock = new Cock(State.AWAKE);
        System.out.println("Преди трансформацията");
        System.out.println(cock.toString());

        if (FoodType.NORMAL_FOOD.equals(foodType)){
            cock = new Fright_Cock(State.AWAKE);
            System.out.print(cock.toString());
            cock = new Fight_Cock(State.AWAKE);
            System.out.print(cock.toString());
        }
        else{
            System.out.println("нахрането животното с правилната храна :Д");
        }
    }

}
