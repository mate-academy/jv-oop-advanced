package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle = {" + "color: " + getColor() + ", width: " + getWidth()
                + ", height: " + getHeight() + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
