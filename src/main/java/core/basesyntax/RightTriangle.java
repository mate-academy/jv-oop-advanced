package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("First leg: " + firstLeg + " units");
        System.out.println("Second leg: " + secondLeg + " units");
        System.out.println("Color: " + color);
    }
}
