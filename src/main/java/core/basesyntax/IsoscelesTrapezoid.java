package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.height = height;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Figure: Right triangle, area: " + getArea() + " units, sideA: " + sideA + " units, sideB: " + sideB + " units, height: "+ height +" color:" + color);

    }

    @Override
    public double getArea() {
         return (sideA + sideB) / 2 * height;
    }
}
