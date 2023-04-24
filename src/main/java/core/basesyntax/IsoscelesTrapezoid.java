package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseOne;
    private final double baseTwo;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseOne, double baseTwo, double height) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid area: "
                + calculateArea()
                + " sq.units, baseOne: "
                + baseOne
                + " sq.units, BaseTwo: "
                + baseTwo
                + " units, color: "
                + getColor());

    }
}
