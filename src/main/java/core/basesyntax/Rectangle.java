package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, ColorType color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Height - " + height + ", Wigth -" + width
                + ", Area - " + getArea() + ", Color : " + getColor().toLowerCase());
    }
}

