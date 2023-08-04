package core.basesyntax;

public class Rectangle extends Figure {

    private int side1;
    private int side2;

    public Rectangle(int a, int b, String color) {
        this.side1 = a;
        this.side2 = b;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, side a: "
                + side1 + ", side b: " + side2 + " units, color:" + getColor());
    }

}
