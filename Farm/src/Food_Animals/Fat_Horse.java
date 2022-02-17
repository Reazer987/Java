package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Horse;
import Enums.State;

public class Fat_Horse extends FoodAnimal {
    public Fat_Horse(State state) {
        super(state);
    }

    @Override
    public void feed() {
        this.weight+=this.weight*.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Fat_Horse> classNameInstance = Fat_Horse.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
