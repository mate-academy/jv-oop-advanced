package core.basesyntax;
public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    @Override
    public void draw() {
        System.out.println("Figure: right triangle,"
                + " area: " + getArea() + " sq.units"
                + " sideA: " + this.sideA
                + " sideB: " + this.sideB
                + " color: " + this.color);
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }
}