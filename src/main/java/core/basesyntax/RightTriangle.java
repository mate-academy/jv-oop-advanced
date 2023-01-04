package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double side1;
    private double side2;

    public RightTriangle(double side1, double side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightTriangle "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }
}
