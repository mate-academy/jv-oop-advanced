package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
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
        System.out.println("Name: rectangle, width: " + width
                + ", height: " + height + ", area: " + getFormat().format(getArea())
                + ", color: " + color);
    }
}
