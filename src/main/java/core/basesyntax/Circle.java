package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFigureData() {
        return "Figure: circle, area: " + getArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor();
    }
}
