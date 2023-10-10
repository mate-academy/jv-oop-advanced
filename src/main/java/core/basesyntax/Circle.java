package core.basesyntax;

public class Circle extends Figure {
    private float radius;
    private double area;

    public Circle(Color color, float radius) {
        super(color);
        this.radius = radius;
        this.area = getArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + area
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
