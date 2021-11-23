package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private double area;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side a: "
                + sideA + " units, side b: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
