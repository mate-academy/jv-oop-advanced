package core.basesyntax;

public class Circle extends Figure {
    private static final int TEN = 10;
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * TEN) / TEN;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq.units, radius: " + radius + ", color: " + getColor());
    }
}

