package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Area: "
                + getArea() + ", Width: " + width
                + ", Length: " + length + ", Color: "
                + getColor());
    }

}
