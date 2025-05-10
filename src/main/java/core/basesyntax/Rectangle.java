package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, Color color) {
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
