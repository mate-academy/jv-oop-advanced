package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: Rectangle, Area: " + getArea() + " sq. units, SideA: " + sideA
                + " SideB: " + sideB + " units, Color: " + getColor());
    }
}
