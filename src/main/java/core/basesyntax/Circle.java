package core.basesyntax;

public class Circle extends AbstractFigure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle - Color: " + getColor() + ", Radius: "
                + radius + ", Area: " + getArea());
    }
}
