package core.basesyntax;

public class RigthTriangle extends Figure {
    private final double leg1;
    private final double leg2;
    private final double hypotenuse;

    public RigthTriangle(double leg1, double leg2, double hypotenuse, Color color) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (leg1 * leg2) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: triangle, area %f sq. units, %s, color %s\n",
                calculateArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("hypotenuse: %f units", hypotenuse);
    }
}
