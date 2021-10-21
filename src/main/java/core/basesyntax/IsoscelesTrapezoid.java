package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super.setColor(color);
        super.setType("isosceles trapezoid");
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public IsoscelesTrapezoid setSideA(int sideA) {
        this.sideA = sideA;
        return this;
    }

    public int getSideB() {
        return sideB;
    }

    public IsoscelesTrapezoid setSideB(int sideB) {
        this.sideB = sideB;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public IsoscelesTrapezoid setHeight(int height) {
        this.height = height;
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
        return ((sideA + sideB) * height) / 2.0;
    }
}
