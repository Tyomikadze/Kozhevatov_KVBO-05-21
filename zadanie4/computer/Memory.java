package zadanie4.computer;

public class Memory {
    private final int capacity;
    private final int speed;
    private final String name;

    Memory(int cap, int speed, String name) {
        this.capacity = Math.abs(cap);
        this.speed = Math.abs(speed);
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return "Плашка " + name + " объёмом " + capacity + "GB со скоростью" + speed + "Ghz";
    }
}
