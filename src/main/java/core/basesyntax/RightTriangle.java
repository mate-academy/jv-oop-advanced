package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: righttriangle, area: " + getArea()
                + " sq.units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }
}
