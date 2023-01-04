package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double side1;
    private double side2;
    private double side3;

    public IsoscelesTrapezoid(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return ((side1 + side2) / 2) * side3;
    }

    @Override
    public void draw() {
        System.out.println("Figure:IsoscelesTrapezoid "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }
}
