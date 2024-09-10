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
    public void returnInfo() {
        System.out.println("Figure: RightTriangle, area: " + sideA * sideB / 2
                + " sq.units, sideA: " + sideA + ", sideB: " + sideB
                + " units, color: " + getColor());
    }
}
