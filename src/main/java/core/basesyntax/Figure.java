package core.basesyntax;

public abstract class Figure {
    private String color = new ColorSupplier().getRandomColor();

    public String getColor() {
        return color;
    }

    abstract void drow();
}
