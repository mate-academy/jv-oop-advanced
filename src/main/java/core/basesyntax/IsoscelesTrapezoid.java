package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure implements Figure {
    private double leg1;
    private double leg2;
    private double height;

    public IsoscelesTrapezoid(String color, double leg1, double leg2, double height) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((leg1 + leg2) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + getColor() + " , leg 1: "
                + leg1 + "leg 2: " + leg2 + " ,heigh" + height
                + " , area: " + getArea());
    }
}
