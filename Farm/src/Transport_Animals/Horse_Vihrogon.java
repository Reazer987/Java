package Transport_Animals;

import Absraction.TransportAnimal;
import Basic_Animals.Horse;
import Enums.State;

public class Horse_Vihrogon extends TransportAnimal {
    public Horse_Vihrogon(State state) {
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
        Class<Horse_Vihrogon> classNameInstance = Horse_Vihrogon.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
}
