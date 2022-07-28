package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, circle: " + calculateArea() + " sq.units, radius: " + radius
                + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
