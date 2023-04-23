package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstSide + secondSide) * height;
    }

    @Override
    public String printFigure() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + firstSide
                + " units, side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
