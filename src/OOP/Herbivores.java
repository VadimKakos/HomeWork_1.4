package OOP;

public class Herbivores extends Mammals {

    public Herbivores(String typeFood, String livingEnvironment, int moveSpeed, String nickName, int age) {
        super(typeFood, livingEnvironment, moveSpeed, nickName, age);
    }

    public void graze() {
        System.out.println("Посусь");
    }


    public void eat() {
        System.out.println("Кушаю ");
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }

}
