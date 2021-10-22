package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(Color color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + getArea() + " sq.units, top side: "
                + sideA + " down side: "
                + sideB + " height: "
                + height + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
