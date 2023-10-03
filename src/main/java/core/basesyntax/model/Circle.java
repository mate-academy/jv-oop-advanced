package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 100f) / 100f;
    }
}
