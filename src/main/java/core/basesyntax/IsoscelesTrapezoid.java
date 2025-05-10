package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + firstSide + " units, sideB: "
                + secondSide + " units, height: " + height + " units, color: " + color;
    }
}
