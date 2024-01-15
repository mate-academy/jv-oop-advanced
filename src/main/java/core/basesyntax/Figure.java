package core.basesyntax;

public abstract class Figure implements AreaCalculation, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
