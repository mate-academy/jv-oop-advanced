package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + ", radius: " + radius + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        String prettyArea = String.format("%.3f", area).replace(",", ".");
        return Double.parseDouble(prettyArea);
    }
}
