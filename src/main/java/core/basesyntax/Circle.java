package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                           + radius + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
