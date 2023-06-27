package core.basesyntax;

public class RightTriangle extends Triangle {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right rectangle\nColor: " + getColor() + "\nArea: " + getArea()
                + "\nFirst leg: " + firstLeg + "\nSecond leg: " + secondLeg);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
