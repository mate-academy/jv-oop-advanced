package core.basesyntax.model;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
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
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: "
                + "color: " + getColor()
                + ", width: " + getWidth() + " units"
                + ", height: " + getHeight() + " units"
                + ", area: " + getArea() + " square units");
    }
}
