package core.basesyntax.model;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, int width, int height) {
        this(color);
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
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq.units, width = "
                + getWidth() + " units, height = "
                + getHeight() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
