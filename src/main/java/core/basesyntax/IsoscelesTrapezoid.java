package core.basesyntax;

public class IsoscelesTrapezoid extends ColorSupplier implements Figure {
    private int sideA;
    private int sideB;
    private int height;

    public void setParameters(int sideA,int sideB, int h) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = h;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2 * height);
    }

    @Override
    public String behaviour() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, height: " + height
                + " color: " + getRandomColor();
    }
}
