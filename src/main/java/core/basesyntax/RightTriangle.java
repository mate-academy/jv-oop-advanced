package core.basesyntax;

public class RightTriangle extends Figure {

    public RightTriangle(String color, double side, double secondSide) {
        super(color, side, secondSide);
    }

    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units,"
                + " firstLeg: " + sideOrRadius + " units,"
                + " secondLeg: " + secondSide + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return 0.5 * sideOrRadius * secondSide;
    }
}
