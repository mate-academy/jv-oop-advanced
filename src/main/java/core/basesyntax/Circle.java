package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {

    Figure figure = new
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle. Radius: " + radius
                + "mm. Area: " + getArea() + " sq.mm. Color: " + Figure.getColor();
    }
}
