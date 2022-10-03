package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String name, double radius, String color) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Name = " + getName() + " Area = " + calculateArea()
                + " Radius = " + radius + " Color = " + getColor();
    }
}
