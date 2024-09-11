package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (double) (sideA * sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq.units, sideA: " + sideA + ", sideB: " + sideB
                + " units, color: " + getColor());
    }
}
