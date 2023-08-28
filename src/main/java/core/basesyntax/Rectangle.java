package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = color;

    }

    @Override
    public double getArea() {

        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("We have the figure rectangle with height "
                + height + " with width " + width + " with area "
                + width * height + " and color " + color);
    }
}
