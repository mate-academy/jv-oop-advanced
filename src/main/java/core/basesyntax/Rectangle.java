package core.basesyntax;

public class Rectangle extends Figures {
    private int side_a;
    private int side_b;

    public Rectangle(String color, int side_a, int side_b) {
        super(color);
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double getArea() {
        return side_a * side_b;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:" + getArea()
                + " sq. units, side a: " + side_a
                + " units, side b: " + side_b
                + " units, color: " + getColor());
    }
}
