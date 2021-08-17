package figures;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %4.2f sq.units"
                + ", height: %2d units"
                + ", width: %2d units"
                + ", color: %s%n", getArea(), getHeight(), getWidth(), getColor());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
