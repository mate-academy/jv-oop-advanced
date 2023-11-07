package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Figure: Right triangle, area: " + getArea() + " units, base: " + base + " units, height: "+ height +" color:" + color);
    }

    @Override
    public double getArea() {
        return (base * height)/ 0.5;
    }
}
