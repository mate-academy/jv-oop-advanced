package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color colors) {
        super(colors);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: "
                + getArea()
                + ", width: "
                + width
                + ", height: "
                + height
                + ", color: "
                + getColor());
    }
}
