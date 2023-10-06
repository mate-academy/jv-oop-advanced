package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        getArea();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        System.out.println("RightTriangle{" + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
        return "";
    }
}
