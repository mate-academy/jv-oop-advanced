package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return ("Figure: isosceles trapezoid, area: " + getArea() + " sg.units, first side: "
                + firstSide + " units, second side: " + secondSide + " units, heigh: "
                + height + " units, color: " + getColor());
    }
}
