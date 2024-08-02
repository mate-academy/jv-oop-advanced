package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculetion {
    private double sideB;
    private double sideA;

    public Rectangle(double sideA, double sideB, String color, String name) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, "
                + "side A: " + getSideA() + " units, side B: " + getSideB()
                + ", color: " + getColor();
    }
}
