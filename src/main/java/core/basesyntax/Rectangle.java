package core.basesyntax;

public class Rectangle extends Figure {
    protected int sideA;
    protected int sideB;

    public Rectangle(int side1, int side2, String name, String color) {
        super(color, name);
        this.sideA = side1;
        this.sideB = side2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + getArea() + " sq. units, side_a: " + sideA
                + " units, side_b: " + sideB + " units, color " + this.getColor());
    }
}
