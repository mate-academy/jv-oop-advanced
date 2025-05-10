package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double oneSide;
    private double twoSide;
    private double height;

    public IsoscelesTrapezoid(String color, double oneSide, double twoSide, double height) {
        super(color);
        this.oneSide = oneSide;
        this.twoSide = twoSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height / 2) * (oneSide + twoSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + "sq.units, topSide: " + oneSide
                + " units, bottomSide: " + twoSide
                + " units, height: " + height
                + " units, color: " + color);
    }
}
