package core.basesyntax;

abstract class AbstractFigure implements AreaCalculator, Drawable {
    private final String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
