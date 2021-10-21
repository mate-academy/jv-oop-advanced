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
        System.out.println("This " + getColor() + " right triangle has legs "
                + firstLeg + " and " + secondLeg + " and area " + getArea());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
