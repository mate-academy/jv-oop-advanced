package core.basesyntax;

public class RightTriangle extends Figure {
    private final double legA;
    private final double legB;

    public RightTriangle(double legA, double legB, String color) {
        this.legA = legA;
        this.legB = legB;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, katet A: " + legA + " units, katet B: " + legB
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }
}
