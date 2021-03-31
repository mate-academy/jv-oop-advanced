public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        double radius = this.radius;
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + ", radius: "
                + Math.round(getRadius()) + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.round((Math.PI * radius * radius * 100) / 100.0);
    }
}
