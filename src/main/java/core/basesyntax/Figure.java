package core.basesyntax;

public abstract class Figure {
    public static final double COEFFICIENT = 0.5;
    private ColorSupplier randomColor = new ColorSupplier();
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
