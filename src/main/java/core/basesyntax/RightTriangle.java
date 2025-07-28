package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + "first leg: " + firstLeg + "second leg: "
                + secondLeg + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
