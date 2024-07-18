package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        double w = width;  // For better readability
        double h = height;  // For better readability
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }

@Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.2f sq. units, width:"
                + " %.2f units, height: %.2f units, color: %s", getArea(), width, height, getColor()));
    }
}

