package core.basesyntax;

public class Rectangle implements Figure {
    private final FigureColor color;
    private final double width;
    private final double height;

    public Rectangle(FigureColor color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: color = "
                + color
                + ", width = "
                + width
                + ", height = "
                + height + ", area = "
                + getArea() + " sq.units.");
    }
}
