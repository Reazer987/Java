package Food_Animals;

import Absraction.FoodAnimal;
import Basic_Animals.Cock;
import Enums.State;

public class Fright_Cock extends FoodAnimal {
    public Fright_Cock(State state) {
        super(state);
    }

    @Override
    public void feed() {
        this.weight+=this.weight*.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Fright_Cock> classNameInstance = Fright_Cock.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
    public void specialMove() {
        float halfSpeed = (float) this.speed / 2;
        this.speed += halfSpeed;
    }
}

