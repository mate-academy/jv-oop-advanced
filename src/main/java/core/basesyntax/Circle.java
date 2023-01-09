package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", color: " + getColor().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units," + " radius: " + radius + " units");
    }
}
