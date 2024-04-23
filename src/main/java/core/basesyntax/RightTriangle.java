package core.basesyntax;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB, String color) {
        this.legA = legA;
        this.legB = legB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, legA:"
                + legA + ", legB:" + legB + "units, color: " + color);
    }
}
