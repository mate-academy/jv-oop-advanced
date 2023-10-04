package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        setFigureType("circle");
        this.radius = radius;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, radius: " + radius + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
