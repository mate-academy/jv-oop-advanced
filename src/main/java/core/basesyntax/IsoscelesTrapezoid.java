package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        super.setType("isosceles trapezoid");
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2.0) * height;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA: %s units, "
                        + "sideB: %s units, height: %s units, color: %s%n",
                getType(), getArea(), sideA, sideB, height, getColor());
    }
}
