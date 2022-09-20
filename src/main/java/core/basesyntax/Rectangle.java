package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square; Width: %f, Height: %f, Area: %f; Color: %s\n",
                width, height, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
