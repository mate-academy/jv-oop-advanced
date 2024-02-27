package core.basesyntax;

public abstract class Figure implements DrawFigure, AreaCalculator {
    protected String Color;

    protected Figure(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
