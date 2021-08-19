package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.centimeters, "
                + "width: " + getWidth() + ", height: "
                + getHeight() + ", color: " + getColor());
    }
}
