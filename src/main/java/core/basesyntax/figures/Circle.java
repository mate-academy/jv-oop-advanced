package core.basesyntax.figures;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        this.radius = random.nextInt(20) + 1;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.format("Figure: circle, circumradius: %.2f"
                        + ", area: %.2f"
                        + " sq. units, radius: %.2f", getPerimeter(), getArea(), getRadius());
        System.out.format(" units, diameter: %.2f"
                        + " units, color: %s.%n", getDiameter(), getColor());

    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
}
