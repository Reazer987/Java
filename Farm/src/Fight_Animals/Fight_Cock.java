package Fight_Animals;

import Absraction.FightAnimal;
import Enums.State;

public class Fight_Cock extends FightAnimal {
    public Fight_Cock(State state) {
        super(state);
    }

    @Override
    public void aggressionUpdate() {
        this.aggression++;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Fight_Cock> classNameInstance = Fight_Cock.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }


}
