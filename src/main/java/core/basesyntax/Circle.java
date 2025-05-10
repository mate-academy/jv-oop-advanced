package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + areaCalculation() + " units"
                + ", radius: " + radius + " sq. units"
                + ", color: " + getColor());
    }
}
