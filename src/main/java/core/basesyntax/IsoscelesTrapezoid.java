package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.setColor(color);
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
    public void draw() {
        System.out.println(" Figure: isoscelesTrapezoid, area: " + area()
                + " sq.units, sideA: " + getSideA()
                + ", sideB: " + getSideB()
                + ", height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (0.5 * (sideA + sideB)) * height;
    }
}
