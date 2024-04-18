package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("This is a right triangle with area: " + getArea()
                + ", it's firstLeg length is: " + firstLeg
                + " it's secondLeg length is: " + secondLeg + ". It's color is " + color);
    }
}
