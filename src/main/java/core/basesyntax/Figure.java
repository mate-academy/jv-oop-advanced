package core.basesyntax;

public abstract class Figure implements Drawable{

    private final String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return calculateArea();
    }

    protected abstract double calculateArea();
}

