package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: "
                + String.format("%.2f",this.getArea()) + " sq.units, radius: "
                + String.format("%.2f",radius) + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
