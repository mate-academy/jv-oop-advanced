package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle :");
        System.out.println(" sideA: " + sideA
                + " sideB: " + sideB
                + " color: " + getColor()
                + " area: " + getArea());
    }
}
