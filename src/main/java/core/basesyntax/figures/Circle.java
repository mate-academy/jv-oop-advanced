package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
