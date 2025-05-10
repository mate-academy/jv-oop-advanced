package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(String color,int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle"
                + "\n"
                + "Area:"
                + getArea()
                + "\n"
                + "HeightRectangle: "
                + height
                + "\n"
                + "WidthRectangle: "
                + width
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}
