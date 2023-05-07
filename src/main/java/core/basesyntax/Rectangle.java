package core.basesyntax;

public class Rectangle extends Figure {
    public static final int DIVIDER_TWO = 2;
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void getArea() {
        double area = (side1 + side2) * DIVIDER_TWO;
        System.out.println("Figure: rectangle, area: " + area + " sq.units, side 1: " + side1
                + " units, side 2: " + side2 + " units, color: " + getColor().toLowerCase());
    }
}
