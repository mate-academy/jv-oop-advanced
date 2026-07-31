package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg + secondLeg) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, "
                + "height: " + height + ", color: " + color);
    }
}
