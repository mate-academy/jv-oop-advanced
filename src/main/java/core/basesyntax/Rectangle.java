package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.sideA = Math.random();
        this.sideB = Math.random();
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
