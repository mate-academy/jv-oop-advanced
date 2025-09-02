package core.basesyntax.model;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();

    public String getColor() {
        return color;
    }
}
