package core.basesyntax;

public class RightTriangle extends Figure {

    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: RightTriangle");
        System.out.println("Color: " + getColor());
        System.out.println("First Leg: " + firstLeg);
        System.out.println("Second Leg: " + secondLeg);
    }
}
