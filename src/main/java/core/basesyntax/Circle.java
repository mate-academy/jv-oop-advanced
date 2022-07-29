package core.basesyntax;
// 2*radius * pi
public class Circle extends Figure implements Draw, Area{
    private double radius;

    public Circle() {
    }

    public Circle(Color color, double radius) {
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
    public String draw() {
        return "Figure: Circle, " + "square=" + getArea() +", radius=" + radius + ", color=" + getColor() + '.';
    }

    @Override
    public double getArea() {
        return 2 * radius * Math.PI;
    }
}
