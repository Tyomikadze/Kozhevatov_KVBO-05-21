package zadanie4.computer;

public class Computer {
    private final Model model;
    Computer(Model mod) {
        this.model = mod;
    }
    Computer() {
        this.model = Model.MODELX;
    }
    public Model getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "Компьютер модели " + model.name() + "С процессором " + getModel().getProcessor() +
                "c памятью " + getModel().getMemory() + "c монитором " + getModel().getMonitor();
    }
}
