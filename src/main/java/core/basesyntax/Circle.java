package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + String.format("%.1f",getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
