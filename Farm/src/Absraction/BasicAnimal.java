package Absraction;

import Enums.State;

import java.util.Random;

public abstract class BasicAnimal extends Animal {

    public BasicAnimal(State state) {
        super(state);
    }

    public abstract void makeSound();




}
