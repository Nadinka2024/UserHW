package Lesson5Zoo;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Hare hare = new Hare();
        Fish fish = new Fish();

        Zookeeper zookeeper = new Zookeeper();

        zookeeper.makeEat(tiger);
        zookeeper.makeJump(tiger);

        zookeeper.makeEat(hare);
        zookeeper.makeJump(hare);

        zookeeper.makeEat(fish);
        zookeeper.makeJump(fish);
    }

}
