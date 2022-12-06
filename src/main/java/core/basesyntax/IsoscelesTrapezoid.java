package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(Color color, int secondLeg, int firstLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg + secondLeg) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area " + getArea()
                + " sq. units, height: " + height
                + " units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
