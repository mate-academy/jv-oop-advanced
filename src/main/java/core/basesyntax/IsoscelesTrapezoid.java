package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperLine;
    private double bottomLine;
    private double height;

    public IsoscelesTrapezoid(String color, double upperLine, double bottomLine, double height) {
        super(color);
        this.upperLine = upperLine;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    public double getUpperLine() {
        return upperLine;
    }

    public double getBottomLine() {
        return bottomLine;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (upperLine + bottomLine) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + Math.round(getArea()) + " sq. units, height: "
                + Math.round(getHeight()) + " units, color: "
                + getColor();
    }
}
