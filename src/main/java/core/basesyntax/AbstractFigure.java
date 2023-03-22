package core.basesyntax;

abstract class AbstractFigure implements AreaCalculator, Drawable {
    private Colors color;

    public AbstractFigure(Colors color) {
        this.color = color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor(Colors color) {
        return color;
    }

}
