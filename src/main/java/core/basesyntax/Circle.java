package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.rint((Math.PI * radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color "
                + getColor());
    }
}
