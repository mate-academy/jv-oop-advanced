package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Type = Rectangle, side 1 = "
                + sideA + ", side 2 = " + sideB + ", area = "
                + getArea() + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
