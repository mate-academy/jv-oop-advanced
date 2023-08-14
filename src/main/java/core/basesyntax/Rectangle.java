package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.2f sq.units, "
                        + "height: %.2f units, width: %.2f units, color: %s",
                            getArea(), height, width, color));
    }
}
