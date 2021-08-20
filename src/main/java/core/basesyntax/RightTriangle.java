package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        super.setType("right triangle");
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }

    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA: %s units, sideB: %s units, "
                + "color: %s%n", getType(), getArea(), sideA, sideB, getColor());
    }
}
