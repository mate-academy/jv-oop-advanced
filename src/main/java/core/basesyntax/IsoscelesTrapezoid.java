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
        return (firstSide + secondSide) * height;
    }

    @Override
    public String getInfo() {
        return "Figure: isosceles trapezoid, area: "
                + String.format("%.2f", getArea()) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}
