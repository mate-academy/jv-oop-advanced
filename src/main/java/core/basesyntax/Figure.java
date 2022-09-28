package core.basesyntax;

public abstract class Figure implements AreaCalculator, InfoImplementer {
    private static final ColorSupplier colSup = new ColorSupplier();
    private String color;

    public abstract String name();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
