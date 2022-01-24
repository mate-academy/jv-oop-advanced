package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle. Radius: " + radius
                + "mm. Area: " + getArea() + " sq.mm. Color: " + getColor();
    }
}
