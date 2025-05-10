package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Shape {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * (upperBase + lowerBase);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid,"
                + " area: " + calculateArea() + " sq. units,"
                + " top: " + upperBase + " units,"
                + " base: " + lowerBase + " units,"
                + " height: " + height + " units,"
                + " color: " + color + "\"");
    }
}
