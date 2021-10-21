package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super.setColor(color);
        super.setType("rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public Rectangle setSideA(int sideA) {
        this.sideA = sideA;
        return this;
    }

    public int getSideB() {
        return sideB;
    }

    public Rectangle setSideB(int sideB) {
        this.sideB = sideB;
        return this;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA:"
                       + " %s units, sideB: %s units, color: %s%n",
                getType(), getArea(), sideA, sideB, getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
