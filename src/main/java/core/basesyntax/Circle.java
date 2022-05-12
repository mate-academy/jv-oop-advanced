package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        this.setName("Circle");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + this.getName() + ", area: "
                + String.format("%.2f",this.area()) + " sq.units, radius: "
                + String.format("%.2f",radius) + " units, color: " + getColor());
    }
}
