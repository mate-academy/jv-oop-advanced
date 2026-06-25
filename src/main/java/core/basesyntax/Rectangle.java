package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, Double width, Double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.1f sq. units, "
                        + "width: %.1f units, length: %.1f units, color: %s",
                         getArea(), width, length, getColor()));
    }
}
