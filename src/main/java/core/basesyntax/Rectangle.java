package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + calculateArea() + " sq. units, "
                        + "height: " + height + " units, "
                        + "width: " + width + " units, "
                        + "color: " + getColor()
        );
    }
}
