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
        System.out.println();
    }
}
