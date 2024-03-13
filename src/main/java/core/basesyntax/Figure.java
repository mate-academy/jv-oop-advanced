package core.basesyntax;

abstract public class Figure implements Figurable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract public double getArea();
    abstract public void draw();
}
