package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "Isosceles Trapezoid";
    private double shorterBase;
    private double longerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double shorterBase, double longerBase,
                              double height) {
        super(color);
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units" + getUniqueProperties()
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return (shorterBase + longerBase) * height / 2;
    }

    @Override
    public String getUniqueProperties() {
        return ", shorter base: " + shorterBase + " units" + ", longer base: " + longerBase
                + " units" + ", height: " + height + " units";
    }
}
