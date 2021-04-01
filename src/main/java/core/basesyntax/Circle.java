package core.basesyntax;

public class Circle extends Figure implements GetArea {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, "
                + "area:"
                + getArea()
                + ", radius"
                + radius
                + ", color:"
                + getColor());
    }
}
