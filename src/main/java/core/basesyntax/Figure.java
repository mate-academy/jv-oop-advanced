package core.basesyntax;

public abstract class Figure implements Drawable, Calculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

   // public abstract double getArea();
}
