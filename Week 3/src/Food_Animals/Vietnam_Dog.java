package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Dog;
import Enums.State;

public class Vietnam_Dog extends FoodAnimal {
    public Vietnam_Dog(State state) {
        super(state);
    }

    @Override
    public void feed() {
        this.weight+=this.weight*.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Vietnam_Dog> classNameInstance = Vietnam_Dog.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
