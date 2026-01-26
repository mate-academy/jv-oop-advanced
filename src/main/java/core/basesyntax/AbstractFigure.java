package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    private String color;

    public AbstractFigure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
