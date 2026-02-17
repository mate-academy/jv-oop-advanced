package core.basesyntax;

public class Circle implements Figure, FigureDraw {
    private double circleRadius;
    private String color;
    private static final double ROUNDING_FACTOR = 10.0;

    public Circle(double circleRadius, String color) {
        this.circleRadius = circleRadius;
        this.color = color;
    }

    @Override
    public double getArea() {
        double raw = Math.PI * circleRadius * circleRadius;
        return Math.round(raw * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + circleRadius + " units, color: " + color);
    }
}
