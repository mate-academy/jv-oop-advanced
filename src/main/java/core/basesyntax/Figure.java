package core.basesyntax;

public abstract class Figure
        implements AreaCalculator, FigureDraw {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getClass().getName() + ", color:" + color;
    }
}
