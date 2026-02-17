package core.basesyntax;

public class Circle implements Figure {
    private double circleRadius;
    private String color;

    public Circle(double circleRadius, String color) {
        this.circleRadius = circleRadius;
        this.color = color;
    }

    @Override
    public double getArea() {
        double raw = Math.PI * circleRadius * circleRadius;
        return Math.round(raw * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + circleRadius + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
