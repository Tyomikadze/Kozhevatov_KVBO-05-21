package zadanie4.computer;

public class Monitor {
    private final String name;
    private final int diag;
    private final int frequency;
    Monitor(String name, int diag, int freq) {
        this.name = name;
        this.diag = Math.abs(diag);
        this.frequency = Math.abs(freq);
    }

    public String getName() {
        return name;
    }

    public int getDiag() {
        return diag;
    }

    public int getFrequency() {
        return frequency;
    }
    @Override
    public String toString() {
        return "Монитор " + name + " диагональю " + diag + "inch с частотой обновления " + frequency + "Hz";
    }
}
