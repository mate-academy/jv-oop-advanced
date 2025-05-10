package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    private String color() {
        return getColor();
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " units, side: " + sideA + "," + sideB
                + " units, color: " + color());
    }
}
