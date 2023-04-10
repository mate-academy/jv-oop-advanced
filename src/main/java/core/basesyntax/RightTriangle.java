package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
    @Override
    public void draw() {
        System.out.println("Right triangle:");
        System.out.println("First Leg: " + firstLeg);
        System.out.println("Second Leg: " + secondLeg);
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}
