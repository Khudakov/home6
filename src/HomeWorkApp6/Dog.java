package HomeWorkApp6;

public class Dog extends Animal {

    public static int countDog = 0;
    public static String type = "Dog";

    Dog(String name, float run, float swim) {
        super(type, name, run, swim);
        ++countDog;
    }
}
