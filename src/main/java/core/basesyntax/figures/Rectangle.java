package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "width=" + getWidth()
                + ", height=" + getHeight()
                + ", color='" + getColor()
                + ", area='" + calculateArea()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
