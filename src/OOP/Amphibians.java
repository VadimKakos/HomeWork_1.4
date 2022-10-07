package OOP;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String livingEnvironment, String nickName, int age) {
        super(livingEnvironment, nickName, age);
    }

    public void hunting() {
        System.out.println("Охочусь");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment.isEmpty() || livingEnvironment == null) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public void eat() {
        System.out.println("Кушаю");
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }

}

