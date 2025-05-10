package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2, Color color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int getArea() {
        return side1 * side2;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + " rectangle with sides " + side1 + " and "
                + side2 + " and area of " + getArea());
    }
}
