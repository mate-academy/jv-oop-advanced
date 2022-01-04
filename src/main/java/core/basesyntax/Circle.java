package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: circle, area: " + area + " radius, color: " + color);
    }
}
