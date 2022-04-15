package core.basesyntax.figure;

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
    public double getArea() {
        double area = getSideA() * getSideB();
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RECTANGLE, area: " + String.format("%.2f", getArea())
                + " sq.units, sideA: " + getSideA() + " units, sideB: "
                + getSideB() + " units, color: " + getColor());
    }
}
