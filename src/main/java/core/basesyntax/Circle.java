package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = area();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %d units, color: %s%n",
                area, radius, color);
    }
}
