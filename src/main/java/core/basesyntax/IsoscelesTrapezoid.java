package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid() {
        this.firstSide = getNumber();
        this.secondSide = getNumber();
        this.height = getNumber();
    }

    public double getArea() {
        return (firstSide + secondSide) * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + String.format("%.2f", getArea()) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}
