package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Camel;
import Enums.State;

public class Delicious_Camel extends FoodAnimal {
    public Delicious_Camel(State state) {
        super(state);
    }

    @Override
    public void feed() {
       this.weight+=this.weight*.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Delicious_Camel> classNameInstance = Delicious_Camel.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
