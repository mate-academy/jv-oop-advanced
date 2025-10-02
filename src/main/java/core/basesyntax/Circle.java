package core.basesyntax;

public class Circle extends Figure {
    final static String FIGURE_NAME = "Circle";
    private int radius;

    public Circle(Color color, int raduis) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String draw() {
        return "Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, raduis: " + radius
                + " units, color: " + getColor();
    }
}
