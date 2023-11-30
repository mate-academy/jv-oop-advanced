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
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, " + "height: " + height
                + " units," + " color: " + color);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
