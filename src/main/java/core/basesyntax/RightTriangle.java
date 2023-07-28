package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg = 0;

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("FirstLeg: %s, SecondLeg: %s", firstLeg, secondLeg);
    }
}
