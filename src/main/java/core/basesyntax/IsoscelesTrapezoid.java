package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int firstSide;
    private final int secondSide;

    public IsoscelesTrapezoid(Color color, int height, int sideA, int sideB) {
        super(color);
        this.height = height;
        this.firstSide = sideA;
        this.secondSide = sideB;
    }

    @Override
    public double calculateArea() {
        return ((firstSide + secondSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid"
                + ", area: "
                + calculateArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + getColor().name());
    }
}
