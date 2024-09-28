package core.basesyntax;

public class RightTriangle extends Figure {
    private final double katetA;
    private final double katetB;

    public RightTriangle(double katetA, double katetB) {
        this.katetA = katetA;
        this.katetB = katetB;
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + obtainTheArea()
                + " sq. units, katet A: " + katetA + " units, katet B: " + katetB
                + " units, color: " + getColor());
    }

    @Override
    public double obtainTheArea() {
        return (katetA * katetB) / 2;
    }
}
