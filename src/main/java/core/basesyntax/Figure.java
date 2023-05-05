package core.basesyntax;

public abstract class Figure implements Drawable, CalculatorArea {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
