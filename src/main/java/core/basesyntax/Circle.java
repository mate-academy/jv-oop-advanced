package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setType("Circle");
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq.units, radius: %s units, color: %s%n",
                getType(), getArea(), radius, getColor());
    }
}
