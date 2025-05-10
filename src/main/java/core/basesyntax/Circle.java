package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.ceil(area * 10) / 10;
    }
}
