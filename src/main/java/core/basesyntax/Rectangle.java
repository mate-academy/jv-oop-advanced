package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        if (sideA <= 0 || sideB <= 0) {
            System.out.println("Side must be bigger than 0");
            return;
        }

        this.sideA = sideA;
        this.sideB = sideB;
        super.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, side a = " + sideA + " units;"
                + " side b = " + sideB + " units;"
                + " area = " + String.format("%.2f", getArea()) + " sq.units;"
                + " color = " + super.color;
    }
}
