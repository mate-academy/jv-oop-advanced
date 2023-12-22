package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double)(firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", "
                + "Area " + getArea() + " sq. units, "
                + "First Leg " + firstLeg + " units, "
                + "Second Leg " + secondLeg + " units, "
                + "Height " + height + " units, "
                + "Color " + color);
    }
}
