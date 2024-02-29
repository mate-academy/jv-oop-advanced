package core.basesyntax;

public abstract class RandomFigure implements AreaCalculator, Draw {
    protected String color;

    public RandomFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
