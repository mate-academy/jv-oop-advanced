package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle "
                + "area: " + getArea()
                + "width: " + width
                + "height: " + height
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
