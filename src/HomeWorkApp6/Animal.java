package HomeWorkApp6;

public abstract class Animal {

   static final int Swim_Ok = 10;
   static final int Swim_No = 5;
   static final int Swim_None = 0;


    private String type;
    protected String name;
    private  float maxRun;
    private float maxSwim;

    public static int countAnimal = 0;

    Animal(String type, String name, float run, float swim) {
        this.type = type;
        this.name = name;
        this.maxRun = run;
        this.maxSwim = swim;
        ++countAnimal;
    }

    String getType() {
        return this.type;
    }

    String getName() {
        return this.name;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    float getMaxRun() {
        return this.maxRun;
    }
    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? Swim_Ok : Swim_No;
    }



}





