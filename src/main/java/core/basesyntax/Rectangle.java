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
    public void draw() {
        System.out.println("Figure Rectangle, Area = " + getArea() + " Color: " + color);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
