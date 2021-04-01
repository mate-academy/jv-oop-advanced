package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public String color;

    public Figure(String color) {
        this.color = color;
    }
}
