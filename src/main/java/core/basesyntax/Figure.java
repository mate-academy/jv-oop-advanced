package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String figure;
    private final String color;

    public Figure(String figure, String color) {
        this.figure = figure;
        this.color = color;
    }

    public String getFigure() {
        return figure;
    }

    public String getColor() {
        return color;
    }
}
