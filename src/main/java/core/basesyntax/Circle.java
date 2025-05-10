package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super("circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape()
                + ", area: " + this.getArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }
}
