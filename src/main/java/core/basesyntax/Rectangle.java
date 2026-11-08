package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this. height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Figure width: "
                + width
                + ", height: "
                + height
                + ", Area: "
                + getArea()
                + " Color: "
                + getColor());
    }
}
