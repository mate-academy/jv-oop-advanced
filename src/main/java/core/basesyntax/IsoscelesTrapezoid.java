package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double longerBase;
    private final double shorterBase;
    private final double leg;

    public IsoscelesTrapezoid(Color color, double longerBase, double shorterBase, double leg) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.leg = leg;
    }

    public double calculateArea() {
        return round(((longerBase + shorterBase) * getHeight()) / 2);
    }

    private double getHeight() {
        return round((Math.sqrt(4 * Math.pow(leg, 2) - Math.pow(longerBase - shorterBase, 2))) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", longer base: " + round(longerBase) + " units"
                + ", shorter base: " + round(shorterBase) + " units"
                + ", leg: " + round(leg) + " units"
                + ", height: " + getHeight() + " units"
                + ", area: " + calculateArea() + " sq. units"
                + ", color: " + color);
    }
}
