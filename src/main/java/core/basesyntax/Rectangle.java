package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(Color color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectaangle, area: " + getArea() + " sq.units, side1: "
                + side1 + "units, side2: " + side2 + " color: " + getColor());
    }
}
