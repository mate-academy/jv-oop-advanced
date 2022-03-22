package core.basesyntax;

public class Rectangle extends Figure implements FigureDetailer {
    private String name = "rectangle";
    private int side1;
    private int side2;
    private Color color;

    public Rectangle(int side1, int side2, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    @Override
    public int getArea() {
        return side1 * side2;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + name + " with sides " + side1 + " and "
                + side2 + " and area of " + getArea());

    }

    @Override
    public Color getColor() {
        return color;
    }
}
