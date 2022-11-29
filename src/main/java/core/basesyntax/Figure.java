package core.basesyntax;

public abstract class Figure {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected abstract double getArea();

    protected abstract String draw();
}
