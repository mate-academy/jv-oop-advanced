package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    protected int height;
    protected int sideA;
    protected int sideB;

    public IsoscelesTrapezoid(int height, int sideA, int sideB, String name, String color) {
        super(color, name);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return height / 2 * (sideA + sideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: " + getArea()
                + " sq. units, side_a: " + sideA + " units, side_b: "
                + sideB + " units, height: " + height + " units, color " + this.getColor());
    }
}
