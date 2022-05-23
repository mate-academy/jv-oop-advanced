package core.basesyntax.model;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
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
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure is: " + getClass().getSimpleName() + "; "
                + "area is :" + getArea() + "; "
                + "height is :" + getHeight() + "; "
                + "width is :" + getWidth() + ";"
                + "color is: " + getColor());
    }
}
