package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double leg1;
    private final double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (leg1 * leg2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle("
                + "color: " + color
                + ", leg1: " + leg1
                + ", leg2: " + leg2
                + ", area: " + getArea()
                + ")");
    }
}
