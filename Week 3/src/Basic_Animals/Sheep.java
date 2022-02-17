package Basic_Animals;

import Absraction.BasicAnimal;
import Enums.State;

public class Sheep extends BasicAnimal {
    public Sheep(State state) {
        super(state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Sheep> classNameInstance = Sheep.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Beeee");
    }
}
