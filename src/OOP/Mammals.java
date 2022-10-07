package OOP;

public class Mammals extends Animals {


    public Mammals(String typeFoodString,String livingEnvironment, int moveSpeed, String nickName, int age) {
        super(typeFoodString,livingEnvironment, moveSpeed, nickName, age);
    }




    public void eat() {
        System.out.println("Кушаю " );
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }
}
