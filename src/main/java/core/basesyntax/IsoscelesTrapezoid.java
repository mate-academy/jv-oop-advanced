package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(double longerBase, double shorterBase, double height, Color color) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((longerBase + shorterBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, longer base: " + longerBase + " units, shorter base: " + shorterBase
                + " units, height: " + height + " units, color: " + color);
    }
}
