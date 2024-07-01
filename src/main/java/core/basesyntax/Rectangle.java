package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        String output = String.format(
                "Figure: rectangle, area: %.2f sq. units, "
                        + "length: %.2f units, width: %.2f units, color: %s",
                getArea(), length, width, super.getColor());
        System.out.println(output);
    }
}
