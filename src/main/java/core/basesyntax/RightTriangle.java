package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units");
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
