package core.basesyntax;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "circle";
    private int radius;

    public Circle(String color, int radius) {
        super(color);
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
                + getArea() + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
