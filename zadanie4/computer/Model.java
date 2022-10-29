package zadanie4.computer;

public enum Model {
    MODELX(new Processor("Intel core i98",8,4.5f),
            new Memory(8,1244,"Gigabyte"),
            new Monitor("Dell",32, 60)),
    MODELY(new Processor("AMD G15", 2, 2.2f),
            new Memory(6, 2655, "BEST OZU"),
            new Monitor("LG",32,144)),
    MODELZ(new Processor("Intel xeon",12,3.5f),
            new Memory(16, 9999,"LOL_ETO_PAMYAT"),
            new Monitor("Samsung", 24, 240));

    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    Model(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
    public Processor getProcessor() {
        System.out.println(processor.toString());
        return processor;
    }
    public Memory getMemory() {
        System.out.println(memory.toString());
        return memory;
    }

    public Monitor getMonitor() {
        System.out.println(monitor.toString());
        return monitor;
    }
}
