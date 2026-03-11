package core.basesyntax;

public class RightTriangle extends Figure {
    private final double legA;
    private final double legB;

    public RightTriangle(String color, double legA, double legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + this.getArea()
                + "sq. units, legA: "
                + this.legA
                + " units, legB: "
                + this.legB
                + " units, color: "
                + this.getColor());
    }
}
