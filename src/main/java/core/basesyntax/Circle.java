package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        if (radius <= 0) {
            System.out.println("Radius must be bigger than 0");
            return;
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, radius = " + radius + " units;"
                + " area = " + String.format("%.2f", getArea()) + " sq.units;"
                + " color = " + super.color;
    }
}
