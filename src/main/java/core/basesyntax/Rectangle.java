package core.basesyntax;

public class Rectangle extends Figure {

    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    void draw() {
        System.out.println("Figure: Rectangle");
        System.out.println("Color: " + getColor());
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
