package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure() {
        color = "white";
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
