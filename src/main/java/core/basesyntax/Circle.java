package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Figure figure) {
        System.out.println("Figure: Circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + this.color);
    }
}
