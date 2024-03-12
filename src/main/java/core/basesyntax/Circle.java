package core.basesyntax;

public class Circle extends Figure {
    private int radius = 0;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Color color) {
        super(color);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color.name().toLowerCase());
    }
}
