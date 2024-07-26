package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String color, double lowerBase, double upperBase, double height) {
        super(color, FigureList.ISOSCELES_TRAPEZOID.name());
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (lowerBase + upperBase) * height;
    }

    @Override
    public String getFigureData() {
        return "lowerBase: " + lowerBase + " units upperBase: " + upperBase + " units height: " + height;
    }
}
