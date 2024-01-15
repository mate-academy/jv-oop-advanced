package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String color, int side1, int side2, int height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side1 + side2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, side1: "
                + side1 + " units, side2: " + side2 + " units, height: " + height
                + " units, color: " + getColor());
    }
}
