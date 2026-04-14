package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color, FigureType.ISOSCELES_TRAPEZOID);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase() + ", "
                + "area: " + calculateArea() + " sq. units, "
                + "upperBase: " + upperBase + " units, "
                + "lowerBase: " + lowerBase + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
