package core.basesyntax;

public class IsoscelesTrapezoid extends Colorable {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq. units, first leg: " + firstLeg + " units, second leg: " + secondLeg
                + " units, height: " + height + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
