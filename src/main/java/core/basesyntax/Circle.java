package core.basesyntax;

public class Circle extends Figure {
    private Double radius;

    public Circle(Double radius, String color) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor() + "\n");
    }
}
