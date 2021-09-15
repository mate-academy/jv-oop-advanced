package core.basesyntax;

public abstract class Figure {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String draw();
}
