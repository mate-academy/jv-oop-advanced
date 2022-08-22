package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
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
    public double getFigureArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void figureDraw() {
        System.out.println("Figure is: Circle " + "area is " + getFigureArea() + " sq.units, "
                + "radius is: " + getRadius() + " units, " + "color is: " + getColor());
    }
}
