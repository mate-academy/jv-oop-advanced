package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSide, int topSide, int height) {
        this.height = height;
        this.topSide = topSide;
        this.baseSide = baseSide;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseSide + topSide) * height;
    }

    @Override
    public String drawTheFigure() {
        return "Figure : isoscelesTrapezoid, area: " + calculateArea()
                + " sq.units, sideA: " + baseSide + " units, sideB: "
                + topSide + " units, color: " + color.toLowerCase();
    }
}
