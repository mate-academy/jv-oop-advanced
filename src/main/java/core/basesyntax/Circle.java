package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void area() {
        setArea(Math.PI * this.radius * this.radius);
    }

    @Override
    public void info() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, radius: " + this.radius
                + "units, " + "color: " + getColor());
    }
}
