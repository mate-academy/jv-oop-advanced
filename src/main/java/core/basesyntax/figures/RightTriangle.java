package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, "
                                                        + "first leg: " + firstLeg + " units, "
                                                        + "second leg: " + secondLeg + " units, "
                                                        + "color: " + color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
