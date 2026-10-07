package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;

    public RightTriangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return (double) 1 / 2 * sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calcArea()
                + " sq. units, side A: " + sideA + " units, side B: " + sideB
                + " units, color: " + getColor()
        );
    }
}
