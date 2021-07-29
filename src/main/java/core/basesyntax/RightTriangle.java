package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    double firstLeg;
    double secondLeg;

    @Override
    public void draw() {
        System.out.println("Figure: ");
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }
}
