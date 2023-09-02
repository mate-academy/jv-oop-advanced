package core.basesyntax;

public abstract class FigureAbstract implements Drawable, AreaCalculator {
    private String color;

    public FigureAbstract() {
    }

    protected FigureAbstract(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
