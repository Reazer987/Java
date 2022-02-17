package Absraction;
import Enums.State;
import java.util.Random;
public abstract class FightAnimal extends Animal {

    public FightAnimal(State state) {
        super(state);
    }

    public abstract void aggressionUpdate();


}

