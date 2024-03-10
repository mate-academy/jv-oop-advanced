package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, height: " + height + " units, width: "
                + width + ", color: " + getColor());
    }
}
