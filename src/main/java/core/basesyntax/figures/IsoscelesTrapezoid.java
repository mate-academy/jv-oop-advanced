package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    public String getFigureInfo() {
        return " upper base: " + upperBase + " lower base: "
                + lowerBase + " height: " + height + " units,";
    }
}
