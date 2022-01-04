package core.basesyntax;

public abstract class Figure {
    private String color = new ColorSupplier().getRandomColor();
    private int firstProperties;
    private int secondProperties;

    public Figure(int firstProperties) {
        this.firstProperties = firstProperties;
    }

    public Figure(int firstProperties, int secondProperties) {
        this.firstProperties = firstProperties;
        this.secondProperties = secondProperties;
    }

    public String getColor() {
        return color;
    }

    public int getFirstProperties() {
        return firstProperties;
    }

    public int getSecondProperties() {
        return secondProperties;
    }
}
