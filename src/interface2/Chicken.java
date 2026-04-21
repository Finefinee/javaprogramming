package interface2;

import abstract2.AbstractAnimal;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void move() {
        System.out.println("닭 이동");
    }

    @Override
    public void introduce() {
        System.out.println("저는 닭입니다. 눈은 " + DEFAULT_EYE_COUNT + "개.");
    }

    @Override
    public void fly() {
        System.out.println("조금 날기");
    }
}
