package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, "
                +
                "radius: " + radius + " units, " + "color: " + color);
    }
}
