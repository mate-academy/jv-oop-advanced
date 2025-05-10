package core.basesyntax;

public abstract class Figure implements Drawable, CalculateArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getS();

    public abstract void drawFigure();

    public String getColor() {
        return this.color;
    }
}
