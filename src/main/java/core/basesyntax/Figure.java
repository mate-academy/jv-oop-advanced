package core.basesyntax;

public abstract class Figure implements Description {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected abstract double getArea();

    public abstract String draw();
}
