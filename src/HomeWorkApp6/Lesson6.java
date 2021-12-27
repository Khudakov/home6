package HomeWorkApp6;

public class Lesson6 {

    public static void main(String[] args) {

        String eventVictory = " удалось";
        String eventLoss = " не получилось";
        String eventName;
        String eventResult;



        Cat cat = new Cat("Marquis", 200, 0);
        Dog dog = new Dog("Rich", 500, 10);

        Animal[] animals = {cat, dog};

        float runLength = 150;
        float swimLength = 9;

        for (int i = 0; i < animals.length; i++) {

            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = " бежать " + animals[i].getMaxRun() + " м. Пробует пробежать на ";

            eventResult = animals[i].run(runLength) ? eventVictory : eventLoss;



            int swimResult = animals[i].swim(swimLength);

            eventName = " проплыть на " + animals[i].getMaxSwim() + "М. Пытается проплыть на ";

            eventResult = (swimResult == Animal.Swim_Ok) ? eventVictory : eventLoss;

            if (swimResult == Animal.Swim_None)

                eventResult = " не удалось, потому что не умеет плавать";

        }

        System.out.println("All animals = " + Animal.countAnimal +" > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog );
    }

    private static void result(String nameAnimal, float eventLength, String resultEvent) {
        System.out.println(nameAnimal +  eventLength + " м и " + resultEvent);
    }
}
