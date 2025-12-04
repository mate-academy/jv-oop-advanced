package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
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
    public double area() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + area() + " sq. units, height: " + height
                + ", side below height: " + width
                + " units, color: " + getColor());
    }
}
