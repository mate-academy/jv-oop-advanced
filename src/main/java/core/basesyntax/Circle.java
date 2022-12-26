package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, " + "area: " + area()
                + " sq.units, " + "radius: " + this.radius
                + " units, " + "color: " + this.getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
