package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int ONE_HALF = 2;
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / ONE_HALF;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle," + " area: " + getArea() + " sq. units,"
                + " first leg: " + firstLeg + " units, second leg: " + secondLeg
                + " units, " + "color: " + getColor());
    }
}
