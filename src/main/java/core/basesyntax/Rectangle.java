package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
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
        System.out.println(String.format("Figure: rectangle, area: %.1f sq.units, "
                                + "width: %.1f units, height: %.1f units, color: %s",
                                getArea(), width, height, getColor().name().toLowerCase()));
    }
}
