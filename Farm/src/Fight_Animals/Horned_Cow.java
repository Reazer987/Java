package Fight_Animals;

import Absraction.FightAnimal;
import Basic_Animals.Cow;
import Enums.State;

public class Horned_Cow extends FightAnimal {
    public Horned_Cow(State state) {
        super(state);
    }

    @Override
    public void aggressionUpdate() {
        this.aggression++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Horned_Cow> classNameInstance = Horned_Cow.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
