package Transport_Animals;

import Absraction.TransportAnimal;
import Enums.State;

public class Fast_Sheep extends TransportAnimal {
    public Fast_Sheep(State state) {
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
        Class<Fast_Sheep> classNameInstance = Fast_Sheep.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }

}
