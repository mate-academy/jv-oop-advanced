package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void drawFigure() {
        System.out.println("Figure: RightTriangle" + ", area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", color: " + color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

}

