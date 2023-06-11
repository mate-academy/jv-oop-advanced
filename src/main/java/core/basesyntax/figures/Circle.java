package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq.unit, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
