package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(int side1, int side2, int height, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        setColor(color);
    }

    @Override
    public void print() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side a: "
                + side1 + ", side b: " + side2 + " ,height: " + height + " units, color:"
                + getColor());
    }

    @Override
    public double getArea() {
        return ((side1 * side2) / 2) * height;
    }
}
