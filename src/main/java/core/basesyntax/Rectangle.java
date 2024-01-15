package core.basesyntax;

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
    public double getArea() {
        return width * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " square: "
                + getArea() + " sq. units, color " + getColor()
                + " width " + width
                + " height " + height);
    }
}
