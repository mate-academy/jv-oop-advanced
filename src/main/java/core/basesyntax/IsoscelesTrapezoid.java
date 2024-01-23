package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure implements Drawable {
    private double upperBase;
    private double lowerBase;
    private double legs;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double legs, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.legs = legs;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an isosceles trapezoid");
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * legs;
    }
}
