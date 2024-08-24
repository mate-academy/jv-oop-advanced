package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area:" + calculateArea()
                + "sq. units, side: " + sideA + "side: " + sideB + " height: " + height
                + " color: " + getColor());
    }
}
