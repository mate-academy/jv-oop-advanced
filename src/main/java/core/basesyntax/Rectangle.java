package core.basesyntax;

public class Rectangle extends Figure {
    private static final String name = "square";
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(int side1, int side2, Colors color) {
        this.side1 = side1;
        this.side2 = side2;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + ", side1: " + side1 + ", side2: " + side2 + ", color: " + getColor());
    }
}
