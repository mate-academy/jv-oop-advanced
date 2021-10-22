package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color) {
        super(color);
    }

    Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                            + getArea() + " sq.units, radius: "
                            + radius + " units, color: " + getColor());
    }
}
