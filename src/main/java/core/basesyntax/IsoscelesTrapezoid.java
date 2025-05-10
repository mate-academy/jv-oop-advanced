package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area:" + getArea() + " sq. units, side_a: "
                + sideA + ", sq. units, side_b: "
                + sideB + ", sq. units, height: "
                + height + " units, color: " + getSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return ((sideA * sideB) / 2) * height;
    }
}

