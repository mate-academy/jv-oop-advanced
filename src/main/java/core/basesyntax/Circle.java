package core.basesyntax;

public class Circle extends Figures implements DrawFigure {
    private int radius;

    @Override
    public void drawFigure() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
