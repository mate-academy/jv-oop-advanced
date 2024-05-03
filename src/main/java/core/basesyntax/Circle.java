package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int raduis) {
        super(color);
        this.radius = raduis;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius"
                + radius
                + '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Circle{"
                + "color= "
                + getColor()
                + " raduis="
                + radius
                + " area="
                + this.getArea()
                + '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }
}
