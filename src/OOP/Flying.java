package OOP;

public class Flying extends Birds {

    public Flying(boolean typeMove, String nickName, String livingEnvironment, int age) {
        super( typeMove,  nickName,  livingEnvironment,  age);
    }

    public void fly() {
        System.out.println("Лечу");
    }

    public void eat() {
        System.out.println("Кушаю ");
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }
}

