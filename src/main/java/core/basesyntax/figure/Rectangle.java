package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double sideBasis;
    private double height;

    public Rectangle (double sideBasis, double height) {
        this.sideBasis = sideBasis;
        this.height = height;
        this.figureName = FigureName.Rectangle;
    }

    @Override
    public double getArea() {
        return (sideBasis * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + ", "
                + "area: " + getArea() + " sq. units, "
                + "sideBasis: " + sideBasis + ", height: " + height
                + ", color: " + color;
    }
}
