package OOP;

public class Birds extends Animals {

    public Birds(boolean typeMove, String nickName, String livingEnvironment, int age) {
        super( typeMove,  nickName,  livingEnvironment,  age);
    }

    public void hunting() {
        System.out.println("Охочусь");
    }


    public void eat() {
        System.out.println("Кушаю " );
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }
}


