package core.basesyntax;

public class Circle implements Figure {
    private final Color color;
    private static final String FIGURE_NAME = "Circle";
    private int radius;

    public Circle(Color color, int raduis) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, raduis: " + radius
                + " units, color: " + color);
    }
}
