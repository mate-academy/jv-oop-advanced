package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, Color color) {
        super(color);
        this.height = height;
        this.width = width;

    }

    @Override
    public void draw() {
        System.out.println("I am " + getColor()
                + " rectangle, my width is " + width
                + " my height is " + height
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
