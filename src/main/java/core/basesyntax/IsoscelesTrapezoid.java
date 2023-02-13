package core.basesyntax;

public class IsoscelesTrapezoid implements CountArea{
    private int firstLeg;
    private int secondtLeg;
    private int height;

    public IsoscelesTrapezoid (int firstLeg, int secondtLeg, int height) {
        this.firstLeg = firstLeg;
        this.secondtLeg = secondtLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondtLeg) / 2 * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondtLeg: " + secondtLeg + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toString().toLowerCase());
    }
}
