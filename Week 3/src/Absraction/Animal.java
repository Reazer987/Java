package Absraction;

import Enums.State;

import java.util.Random;

public abstract class Animal {
    protected State state;
    public float weight;
    public float aggression;
    public float speed;
    public float energy;
    protected Random random = new Random();

    public Animal(State state){
        this.state = state;
        this.weight = random.nextInt(10 - 1 + 1) + 1;
        this.aggression =random.nextInt(10 - 1 + 1) + 1;
        this.speed =random.nextInt(10 - 1 + 1) + 1;
        this.energy =random.nextInt(10 - 1 + 1) + 1;
    }
}
