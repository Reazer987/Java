package Basic_Animals;

import Absraction.BasicAnimal;
import Enums.State;

public class Cock extends BasicAnimal {
    public Cock(State state) {
        super(state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Cock> classNameInstance = Cock.class;
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
       System.out.println("Cut Cut");
    }
}
