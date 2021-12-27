package HomeWorkApp6;

public class Cat extends Animal {
    public static int countCat = 0;
    public static String type = "Cat";

    Cat(String name, float maxRun, float maxSwim) {
        super(type, name,  maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.Swim_None;
    }
}
