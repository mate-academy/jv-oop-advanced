package core.basesyntax;

abstract class AbstractFigure implements Drawable, AreaCalculator {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
