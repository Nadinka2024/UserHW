package Lesson5Zoo;

public class Tiger extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("Я тигр и я ем мясо.");
    }

    @Override
    void jump() {
        System.out.println("Я животной и я умею прыгать.");
    }
}

