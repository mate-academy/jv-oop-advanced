package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double shorterBase;
    private final double longerBase;
    private final double height;

    public IsoscelesTrapezoid(
            String color, double shorterBase, double longerBase, double height) {
        super(color);
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, shorter base: "
                + shorterBase + " units, longer base: " + longerBase + " units, height: "
                + height + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return (shorterBase + longerBase) * height / 2;
    }
}
