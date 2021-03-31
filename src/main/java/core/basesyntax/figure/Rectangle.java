package core.basesyntax.figure;

public class Rectangle extends Figure implements DrawFigure, CalculateArea {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        double area = side1 * side2;
        double scale = Math.pow(10, 3);
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public String draw() {
        int index = this.getClass().getName().lastIndexOf(".");
        String name = this.getClass().getName().substring(index + 1);
        String figure = "Figure: " + name + ", area: " + this.getArea() + ", sq. units, side 1: "
                + this.side1 + " units, side 2: " + this.side2 + " units, color: "
                + this.getColor();
        return figure;
    }
}
