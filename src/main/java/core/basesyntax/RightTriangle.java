package core.basesyntax;

public class RightTriangle extends Figure {
    private final double katetA;
    private final double katetB;

    public RightTriangle(double katetA, double katetB, String color) {
        this.katetA = katetA;
        this.katetB = katetB;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, katet A: " + katetA + " units, katet B: " + katetB
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (katetA * katetB) / 2;
    }
}
