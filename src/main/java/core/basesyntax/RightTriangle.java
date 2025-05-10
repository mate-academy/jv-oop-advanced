package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
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
        System.out.println("RightTriangle{" + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
    }
}
