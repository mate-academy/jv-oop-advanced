package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea() +
                        ", radius: " + radius +
                        ", color: " + getColor()
        );
    }
}
