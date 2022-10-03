package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String name, double radius, String color) {
        setName(name);
        this.radius = radius;
        setColor(color);
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
