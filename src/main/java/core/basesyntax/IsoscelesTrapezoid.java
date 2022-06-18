package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, String color) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public String toString() {
        return "isosceles trapezoid, area: " + area() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, height: "
                + height + " units, color: " + getColor();
    }

    @Override
    public double area() {
        return 0.5 * (firstLeg + secondLeg) * height;
    }
}
