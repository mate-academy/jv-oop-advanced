package core.basesyntax;

public abstract class Figure implements Drawer, AreaCalculator {
    protected String color;
    protected double area;

    public Figure(String color) {
        this.color = color;
    }
}
