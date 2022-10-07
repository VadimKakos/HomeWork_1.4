package OOP;

public class Predators extends Mammals {

    public Predators(String typeFood, String livingEnvironment, int moveSpeed, String nickName, int age) {
        super(typeFood, livingEnvironment, moveSpeed, nickName, age);
    }

    public void hunting() {
        System.out.println("Охочусь");
    }
    public void eat() {
        System.out.println("Кушаю " + getTypeFood());
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }
}
