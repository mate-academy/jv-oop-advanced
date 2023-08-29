package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        String name = "rectangle";
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + getColor());
    }
}
