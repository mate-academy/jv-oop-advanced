package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first side: " + sideA + " units, second side: "
                + sideB + " units, height " + height + " units, color: " + getColor());
    }
}
