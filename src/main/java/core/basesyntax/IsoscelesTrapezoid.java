package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double longerBase;
    private final double shorterBase;
    private final double height;

    public IsoscelesTrapezoid(double longerBase, double shorterBase, double height, String color) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((shorterBase + longerBase) * height) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq"
                + ", longer base " + longerBase + " units "
                + ", shorter base: " + shorterBase + " units "
                + ", height: " + height + " color: " + color);
    }
}
