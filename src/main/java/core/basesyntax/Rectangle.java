package core.basesyntax;

public class Rectangle extends Figure implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("I am " + color.toString().toLowerCase()
                + " rectangle, my width is " + width
                + " my height is " + height
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
