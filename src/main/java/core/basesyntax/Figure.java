package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String figureColor) {
        this.color = figureColor;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}
