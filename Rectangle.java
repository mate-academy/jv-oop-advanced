package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq. units, width: %.1f, "
                        + "height: %.1f, color: %s%n",
                getArea(), width, height, getColor());
    }
}
