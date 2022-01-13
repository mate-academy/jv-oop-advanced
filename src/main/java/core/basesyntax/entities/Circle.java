package core.basesyntax.entities;

public class Circle extends Figure {
    private static final Integer COEFFICIENT_TWO = 2;
    private Integer radius;

    public Circle() {
    }

    public Circle(Color color, Integer radius) {
        super(color);
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius ^ COEFFICIENT_TWO);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * COEFFICIENT_TWO;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", radius: " + radius
                + ", color: " + getColor());
    }

    @Override
    public Figure clone() {
        return new Circle(getColor(), radius);
    }
}
