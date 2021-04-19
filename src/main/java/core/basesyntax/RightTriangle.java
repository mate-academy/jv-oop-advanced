package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, String name, int firstLeg, int secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ","
                + " area:" + getArea() + " sq. units, side length: "
                + firstLeg + " units, " + secondLeg
                + " units, color: " + getColor());

    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + '}';
    }
}
