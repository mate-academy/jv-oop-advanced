package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Figure: circle, "
                + "area: " + areaCalculation() + " units"
                + ", radius: " + radius + " sq. units"
                + ", color: " + getColor();
    }
}
