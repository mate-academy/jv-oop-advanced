package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int sideA;
    private int sideB;

    public IsoscelesTrapezoid(Color color, int height, int sideA, int sideB) {
        super(color);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return height * 0.5 * sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid"
                + ", area: "
                + calculateArea() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, mirrorSide: "
                + height + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
