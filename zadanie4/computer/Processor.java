package zadanie4.computer;

public class Processor {
    private final int cores;
    private final float c_speed;
    private final String name;
    Processor(String name, int cores , float speed) {
        this.name = name;
        this.cores = Math.abs(cores);
        this.c_speed = Math.abs(speed);
    }

    public int getCores() {
        return cores;
    }

    public float getC_speed() {
        return c_speed;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Процессор " + name + " ядер " + cores + " с частотой " + c_speed + "Ghz";
    }
}
