package core.basesyntax;

public class RightTriangle extends Figure {
    private double legRight;
    private double legLeft;

    public RightTriangle(String color, double legRight, double legLeft) {
        super(color);
        this.legRight = legRight;
        this.legLeft = legLeft;
    }

    @Override
    public double getArea() {
        return this.legRight * this.legLeft / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea() + " sq.units, legRight: "
                + legRight + " units, legLeft: " + legLeft
                + " units, color: " + color);
    }
}
