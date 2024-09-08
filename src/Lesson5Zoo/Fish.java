package Lesson5Zoo;

public class Fish extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("Я рыба и ем корм.");
    }

    @Override
    void jump() {
        System.out.println("Я рыба и я не умею прыгать.");
    }
}
