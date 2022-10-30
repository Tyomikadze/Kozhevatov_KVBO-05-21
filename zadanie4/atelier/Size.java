package zadanie4.atelier;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int eurosize;

    public int getEurosize() {
        return eurosize;
    }

    Size(int eurosize) {
        this.eurosize = eurosize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

}
