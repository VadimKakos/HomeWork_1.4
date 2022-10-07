package OOP;

import java.util.Objects;

public class Animals {
    private String nickName;
    private String typeFood;
    private String livingEnvironment;
    private int moveSpeed;
    private int age;
    private boolean typeMove;

    public Animals(boolean typeMove, String nickName, String livingEnvironment,  int age) {
        this.typeMove = typeMove;
        setNickName(nickName);
        setLivingEnvironment(livingEnvironment);
        setMoveSpeed(moveSpeed);
        setAge(age);
    }

    public Animals(String typeFoodString, String livingEnvironment, int moveSpeed, String nickName, int age) {
        setTypeFoodString(typeFoodString);
        setLivingEnvironment(livingEnvironment);
        setMoveSpeed(moveSpeed);
        setNickName(nickName);
        setAge(age);
    }

    public Animals(String livingEnvironment, String nickName , int age) {
        setLivingEnvironment(livingEnvironment);
        setNickName(nickName);
        setAge(age);
    }

    public void eat() {
        System.out.println("Кушаю");
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void go() {
        System.out.println("Перемещаюсь");
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (nickName.isEmpty() || nickName == null) {
            this.nickName = "default";
        } else {
            this.nickName = nickName;
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFoodString(String typeFood) {
        if (typeFood.isEmpty() || typeFood == null) {
            this.typeFood = "default";
        } else {
            this.typeFood = typeFood;
        }
    }

    public String getLivingEnvironment() {
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            return "";
        } else {
            return livingEnvironment;
        }
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment.isEmpty() || livingEnvironment == null) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        if (moveSpeed == 0) {
            this.moveSpeed = 10;
        } else {
            this.moveSpeed = moveSpeed;
        }
    }

    public boolean isTypeMove() {
        return typeMove;
    }

    public void setTypeMove(boolean typeMove) {
        this.typeMove = typeMove;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            this.age = 10;
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return moveSpeed == animals.moveSpeed && age == animals.age && typeMove == animals.typeMove && Objects.equals(nickName, animals.nickName) && Objects.equals(typeFood, animals.typeFood) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickName='" + nickName + '\'' +
                ", typeFoodString='" + typeFood + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", moveSpeed=" + moveSpeed +
                ", age=" + age +
                ", typeMove=" + typeMove +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, age);
    }

}
