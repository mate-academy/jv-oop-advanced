package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + calculateArea() + " radius: "
                + radius + " color: " + color);
    }
}
