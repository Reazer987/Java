package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Sheep;
import Enums.State;

public class Milk_Sheep extends FoodAnimal {
    public Milk_Sheep(State state) {
        super(state);
    }

    @Override
    public void feed() {
        this.weight+=this.weight*.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Milk_Sheep> classNameInstance = Milk_Sheep.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
