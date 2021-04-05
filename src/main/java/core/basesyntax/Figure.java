package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculator {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract void drawFigure();

    public abstract String uniqueProperty();
}
