package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq. units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
