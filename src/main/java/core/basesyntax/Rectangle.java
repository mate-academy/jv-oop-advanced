package core.basesyntax;

public class Rectangle extends ColorSupplier implements Figure {
    private int sideA;
    private int sideB;

    public void setParameters(int sideA,int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB);
    }

    @Override
    public String behaviour() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + getRandomColor();
    }
}
