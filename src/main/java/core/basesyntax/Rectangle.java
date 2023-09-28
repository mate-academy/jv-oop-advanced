package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawer{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
            + "area: " + getArea() + " sq. units, "
            + "first side: " + sideA + " units, "
            + "second side: " + sideB + " units, "
            + "color: " + color
        );
    }
}
