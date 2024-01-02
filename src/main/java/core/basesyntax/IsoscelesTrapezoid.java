package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double COEFICIENT = 0.5;
    private double sideA;
    private double sideB;
    private double height;

    IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Type = IsoscelesTrapezoid, side 1 = "
                + sideA + ", side 2 = " + sideB + ", height = " + height + ", area = "
                + getArea() + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return COEFICIENT * height * (sideA + sideB);
    }
}
