package core.basesyntax;

public class Rectangle extends Figure {
    public static final int DIVIDER_TWO = 2;
    private final int side1;
    private final int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 + side2) * DIVIDER_TWO;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, side 1: " + side1
                + " units, side 2: " + side2 + " units, color: " + getColor().toLowerCase());
    }
}
