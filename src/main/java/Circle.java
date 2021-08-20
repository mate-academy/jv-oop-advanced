public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "name='" + getName() + '\''
                + ", area=" + getArea() + '\''
                + ", radius=" + radius + '\''
                + ", color='" + getColor() + '\''
                + '}';
    }
}
