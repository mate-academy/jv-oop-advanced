package core.basesyntax;

public abstract class Figure implements Flattable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void drawFigure();

    public String getColor() {
        return color;
    }
}
