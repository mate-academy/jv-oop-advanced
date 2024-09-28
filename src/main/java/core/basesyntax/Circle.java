package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area %.2f, "
                + "radius: %.2f, circle color: %s",
                getArea(), radius, color));
    }
}
