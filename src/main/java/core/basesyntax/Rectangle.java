package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
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
    public void getInfo() {
        System.out.printf("Figure: rectangle, area: %s sq.units, sideA:"
                        + " %s units, sideB: %s units, color: %s%n",
                getArea(), sideA, sideB, getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
