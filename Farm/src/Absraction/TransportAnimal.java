package Absraction;

import Enums.State;

import java.util.Random;

public abstract class TransportAnimal extends  Animal {

    public TransportAnimal(State state) {
        super(state);
    }

    public abstract void speedIncrease();
}
