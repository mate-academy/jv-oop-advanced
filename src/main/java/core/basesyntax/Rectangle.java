package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(double height, double width, Color color) {
        this.type = getClass().getSimpleName();
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", height: " + height + ", width: " + width + ", color: " + color);
    }
}
