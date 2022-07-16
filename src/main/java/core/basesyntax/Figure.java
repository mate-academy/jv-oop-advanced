package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    abstract double getArea();
}
