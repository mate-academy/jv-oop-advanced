package core.basesyntax.figures;

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
    public double obtainArea() {
        return height / 2.0 * (sideA + sideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainArea()
                + " sq.units, side a: " + sideA
                + " units, side b: " + sideB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
