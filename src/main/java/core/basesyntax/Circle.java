package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    @Override
     public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFigureName() {
        return "circle";
    }

    @Override
    public String getDetails() {
        return "radius: " + radius + " units";
    }
}
