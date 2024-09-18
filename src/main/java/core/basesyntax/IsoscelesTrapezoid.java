package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double high;
    private final double firstSide;
    private final double secondSide;

    public IsoscelesTrapezoid(String color, double high, double firstSide, double secondSide) {
        super(color);
        this.high = high;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) * high / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + calculateArea() + "sq. units, sides: "
                + firstSide + " units, "
                + secondSide + " units, high "
                + high + " units, "
                + "color: " + color);
    }
}
