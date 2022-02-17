package Absraction;

import Enums.State;

import java.util.Random;

public abstract class  FoodAnimal extends  Animal{

    public FoodAnimal(State state) {
        super(state);
    }

    public abstract void feed();
}
