package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void draw() {
        System.out.println("This is a rectangle with area: " + getArea()
                + ". It's width is: " + width + ". It's height is: "
                + height + ". It's color is " + color);
    }
}
