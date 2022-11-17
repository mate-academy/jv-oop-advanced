package core.basesyntax;

public class Circle extends Figures implements DrawFigure, GetArea {
    private int radius;

    @Override
    public void drawFigure() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
