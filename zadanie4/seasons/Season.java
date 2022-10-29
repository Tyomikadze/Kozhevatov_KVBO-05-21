package zadanie4.seasons;

public enum Season {
    SUMMER(28) {
        public String getDescription(){
            return "Тёплое время года";
        }
    },
    AUTUMN(10),
    WINTER(-14),
    SPRING(14);

    private final int termo;

    Season(int termo) {
        this.termo = termo;
    }

    public int getTermo() {
        return termo;
    }

    public String getDescription() {
        return "Холодное время года";
        }
}
