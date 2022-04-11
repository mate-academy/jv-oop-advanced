package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.calculateArea()
                + " sq.units, radius: "
                + this.getRadius()
                + " units, color: "
                + this.getColor()
                + "\n");

    }
}
