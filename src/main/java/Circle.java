public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double areaValue() {
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
                + ", area=" + areaValue() + '\''
                + ", radius=" + radius + '\''
                + ", color='" + getColor() + '\''
                + '}';
    }
}
