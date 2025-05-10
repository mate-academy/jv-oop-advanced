package core.basesyntax;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double areaCalculator() {
        return sideA * sideB;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: rectangle, area: " + areaCalculator()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, color: " + getColor());
    }
}
