package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid," + " area: "
                + getArea() + " sq.units," + " firstLeg: " + sideA + " units,"
                + " secondLeg: " + sideB + " units," + " height: "
                + height + " units," + " color: " + color);
    }
}
