package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}
