package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (height * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure rectangle, area: " + calculateArea()
                + ", height " + height + ", width " + width
                + ", color: " + getColor());
    }
}
