package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double bottomSide;
    private final double upperSide;
    private final double height;

    IsoscelesTrapezoid(String color, double bottomSide, double upperSide, double height) {
        super(color);
        this.bottomSide = bottomSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottomSide: " + getBottomSide()
                + " units, upperSide: " + getUpperSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return height * (bottomSide + upperSide) / 2;
    }
}
