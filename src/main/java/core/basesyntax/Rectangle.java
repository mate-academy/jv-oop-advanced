package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.area() + " units, height: " + height
                + " units, width: " + width + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (double)height * width;
    }
}
