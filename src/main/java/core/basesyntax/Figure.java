package core.basesyntax;

abstract class Figure implements Figurable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
