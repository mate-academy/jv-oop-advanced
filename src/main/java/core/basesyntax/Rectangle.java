package core.basesyntax;

public class Rectangle extends Figures implements DrawFigure, GetArea {
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area:" + this.getArea() + " sq.units, sideA: " + this.sideA + "units, sideB: " + this.sideB + " units, color: " + this.getColor());
    }
}
