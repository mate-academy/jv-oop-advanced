package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideB;
    private final double sideA;

    public Rectangle(double sideA, double sideB, String color, String name) {
        super(color, name);
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, "
                + "side A: " + getSideA() + " units, side B: " + getSideB()
                + ", color: " + getColor());
    }
}
