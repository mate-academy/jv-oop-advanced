package core.basesyntax;

public class IsoscelesTrapezoid extends Figure  implements AreaCalculator, Printer {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public String printInfo() {
        return "Figure: triangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "top side: " + topSide + " units, "
                + "top bottom side: " + bottomSide + " units, "
                + "top height: " + height + " units, "
                + "color: " + getColor();
    }
}
