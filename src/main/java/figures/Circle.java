package figures;

import colors.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    @Override
    public String getInfo() {
        return "Circle{color=" + color + "; radius=" + radius + "}";
    }
}
