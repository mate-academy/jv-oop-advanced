package core.basesyntax;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;

    public RightTriangle (double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is Right Triangle. First Leg = " + firstLeg
                + "; Second Leg = " + secondLeg + "; area = " + this.getArea()
                + "; color is " + getColor());
    }
}
