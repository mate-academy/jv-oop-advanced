package core.basesyntax;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "circle";
    private static final double PI = Math.PI;
    private double radius;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(double radius) {
        this.radius = radius;
        setColor(colorSupplier.getRandomColor());
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
    }

    public Circle(double radius, String defaultColor) {
        this.radius = radius;
        setColor(defaultColor);
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, radius: " + radius + " units");
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
