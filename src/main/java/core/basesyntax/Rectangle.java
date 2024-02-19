package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: " + calculateArea() + " sq. units, "
                + "sideA: " + getSideA() + " units, "
                + "sideB: " + getSideB() + " units, "
                + "color: " + this.getColor());
    }
}
