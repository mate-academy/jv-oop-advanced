package core.basesyntax.model;

public class Rectangle extends Figure {
    private final double figureWidth;
    private final double figureHeight;

    public Rectangle(double figureWidth, double figureHeight, String color) {
        this.figureWidth = figureWidth;
        this.figureHeight = figureHeight;
        setColor(color);
    }

    @Override
    public double getArea() {
        return figureHeight * figureWidth;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Rectangle, area: %.1f sq. units, "
                        + "width: %.1f sq. units, height: %.1f, color: %s \n",
                getArea(), figureWidth, figureHeight, getColor());
    }
}
