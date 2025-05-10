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
                "Figure: rectangle; Width: %.2f, Height: %.2f, Area: %.2f; Color: %s\n",
                width, height, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
