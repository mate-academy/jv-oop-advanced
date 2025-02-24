package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area = %.1f sq. units, width = %.1f "
                + "units, height = %.1f units, color: %s%n",
                calculateArea(), width, height, getColor());
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
