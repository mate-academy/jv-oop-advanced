package core.basesyntax;

public class RightTriangle implements Figures {
    private double firstLeg;
    private double secondLeg;
    private Colors color;

    public RightTriangle(double firstLeg, double secondLeg, double c, Colors color) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
