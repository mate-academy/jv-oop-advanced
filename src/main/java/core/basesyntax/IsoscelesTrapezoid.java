package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side1;
    private double side2;
    private double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side1 + side2 / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, side 1: " + side1 + " units, side 2 " + side2
                + " units, height: " + height + " color: " + color);
    }
}
