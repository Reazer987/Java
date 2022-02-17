package Transport_Animals;

import Absraction.TransportAnimal;
import Basic_Animals.Camel;
import Enums.State;

public class TwoBackedCamel extends TransportAnimal {
    public TwoBackedCamel(State state) {
        super(state);
    }

    @Override
    public void speedIncrease() {
        float halfSpeed = (float) this.speed/2;
        this.speed+=halfSpeed;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<TwoBackedCamel> classNameInstance = TwoBackedCamel.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
