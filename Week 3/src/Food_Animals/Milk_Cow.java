package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Cow;
import Enums.State;
import Transport_Animals.TwoBackedCamel;

public class Milk_Cow extends FoodAnimal {
    public Milk_Cow(State state) {
        super(state);
    }

    @Override
    public void feed() {
        this.weight+=this.weight*.10;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Milk_Cow> classNameInstance = Milk_Cow.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
