package core.basesyntax;

public class RightTriangle extends Figure implements DrawArea {
    private int sideA;
    private int sideB;
    public RightTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: right triangle" + ", area: " + getArea() + " sq. units, sideA: " + sideA + " units, sideB: " + sideB + " units, color: " + getColor());
    }
}
