package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw() {
        System.out.println("Figure: circle, " + "area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + color);
    }

}
