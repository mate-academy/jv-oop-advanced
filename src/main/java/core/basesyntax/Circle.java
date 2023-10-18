package core.basesyntax;

public class Circle extends Figure {
    private double radius = 0;

    Circle() {
        super("circle", Color.WHITE);
    }

    Circle(Color color) {
        super("circle", color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Circle radius can't be negative or equal to zero!");
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String info = "Figure: " + getName();
        info += ", area: " + area();
        info += " sq.units, radius: " + radius;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
