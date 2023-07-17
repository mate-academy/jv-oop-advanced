package core.basesyntax;

public class Circle extends AbstractFigure {
    private int radius;
    private String color;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle - Color: " + color
                + ", Radius: " + radius + ", Area: " + getArea());
    }
}
