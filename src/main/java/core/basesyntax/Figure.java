package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void drawFigure();
}
