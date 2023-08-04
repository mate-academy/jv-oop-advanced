package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, ColorType color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, Radius - " + radius + ", Area - "
                + getArea() + ", Color : " + getColor().toLowerCase());
    }
}

