package core.basesyntax;

public class Circle extends Figure implements Area, Drawable {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}
