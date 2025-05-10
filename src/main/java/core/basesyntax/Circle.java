package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                                + getArea()
                                + " sq.units, radius: "
                                + (int)radius
                                + " units, color: "
                                + getColor());
    }
}
