package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        if (sideA <= 0 || sideB <= 0 || height <= 0) {
            System.out.println("Sides or height must be bigger than 0");
            return;
        }
        if (sideA >= sideB) {
            this.baseA = sideA;
            this.baseB = sideB;
        } else {
            this.baseA = sideB;
            this.baseB = sideA;
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseA - baseB) / 2.0) * height + baseB * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, base a = " + baseA + " units;"
                + " base b = " + baseB + " units;"
                + " height = " + height + " units;"
                + " area = " + String.format("%.2f", getArea()) + " sq.units;"
                + " color = " + super.color;
    }
}
