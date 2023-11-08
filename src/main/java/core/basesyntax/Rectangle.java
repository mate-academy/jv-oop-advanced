package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    Rectangle(String color, double width, double height) {
        setColor(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtainArea()
                + " sq. units, width: " + width + ", height: " + height + ", color: " + getColor());
    }
}
