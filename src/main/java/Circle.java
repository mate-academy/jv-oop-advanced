public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
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
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String printInfo() {
        return "Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + super.getColor();
    }
}
