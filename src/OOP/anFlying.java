package OOP;

public class anFlying extends Birds {

    public anFlying(boolean typeMove, String nickName, String livingEnvironment, int age) {
        super(typeMove,nickName,livingEnvironment,age);
    }

    public void walk() {
        System.out.println("Гуляю ");
    }


    public void eat() {
        System.out.println("Кушаю ");
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }
}

