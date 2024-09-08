package Lesson5Zoo;

public class Hare extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("Я травоядное животное.");
    }

    @Override
    void jump() {
        System.out.println("Я заяц и я умею прыгать.");
    }

}
