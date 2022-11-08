package Shop;

public enum Catalog {
    TOY("Toys"), CAR("Cars");
    private final String ctgName;

    Catalog(String ctgName) {
        this.ctgName = ctgName;
    }
    public String getCtgName() {
        return ctgName;
    }
}
