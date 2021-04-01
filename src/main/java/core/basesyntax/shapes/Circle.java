package core.basesyntax.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: " + this.getName() + ", "
                        + "area: %.1f" + " sq. units, "
                        + "radius: " + getRadius() + " units, "
                        + "color: " + this.getColor() + "\n",
                getArea());
    }
}
