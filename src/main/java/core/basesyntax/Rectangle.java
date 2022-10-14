package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

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
        return sideA * sideB;
    }

    @Override
    public void draw() {
        String message = "Figure: rectangle, area: " + getArea()
                + " sq.units, side A: " + getSideA()
                + " units, side B: " + getSideB()
                + " units, color: " + getColor();
        System.out.println(message);
    }
}
