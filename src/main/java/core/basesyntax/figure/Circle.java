package core.basesyntax.figure;

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
    public double getArea() {
        double area = Math.PI * radius * radius;
        double scale = Math.pow(10, 3);
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public String draw() {
        int index = this.getClass().getName().lastIndexOf(".");
        String name = this.getClass().getName().substring(index + 1);
        String figure = "Figure: " + name + ", area: " + this.getArea() + ", sq. units, radius: "
                + this.radius + " units, color: " + this.getColor();
        return figure;
    }
}
