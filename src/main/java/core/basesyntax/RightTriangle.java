package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;

    public RightTriangle(int a, int b, String color) {
        this.side1 = a;
        this.side2 = b;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (side1 * side2) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, side a: "
                + side1 + ", side b: " + side2 + " units, color:" + getColor());
    }
}
