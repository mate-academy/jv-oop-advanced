package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.area() + " units, height: " + height
                + " units, width: " + width + " units, color: " + color);
    }

    @Override
    public double area() {
        return (double)height * width;
    }
}
