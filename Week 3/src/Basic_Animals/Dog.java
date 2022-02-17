package Basic_Animals;

import Absraction.BasicAnimal;
import Enums.State;

public class Dog extends BasicAnimal {
    public Dog(State state) {
        super(state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<Dog> classNameInstance = Dog.class;
        sb.append("Животно"+" " + classNameInstance.getSimpleName()+"\n");
        sb.append("Състояние:"+" " + this.state+"\n");
        sb.append("Тегло:" +" "+ this.weight +"\n");
        sb.append("Агресия:" +" "+ this.aggression+"\n");
        sb.append("Скорорст:" +" "+ this.speed+"\n");
        sb.append("Eнергия:" +" "+ this.energy+"\n");
        return  sb.toString();
    }
    @Override
    public void makeSound() {
        System.out.println("Bau Bau");
    }
}
