package core.basesyntax.figures;

public class Circle extends Shape implements Rounded {
    private int radius;

    public Circle(int value) {
        super();
        this.radius = value;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumradius() {
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
                        + " sq. units, radius: %.2f", getCircumradius(), getArea(), getRadius());
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
