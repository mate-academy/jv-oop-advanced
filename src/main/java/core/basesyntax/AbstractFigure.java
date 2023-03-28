package core.basesyntax;

abstract class AbstractFigure implements AreaCalculator, Drawable {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
