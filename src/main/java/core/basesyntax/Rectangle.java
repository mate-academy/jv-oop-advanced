package core.basesyntax;

public class Rectangle extends Figure {
    private double sideX;
    private double sideY;

    public Rectangle(double sideX, double sideY, String color) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideX * sideY;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " units, sideY: " + sideY + " units, sideX" + sideX + " units, color:" + color);
    }
}
