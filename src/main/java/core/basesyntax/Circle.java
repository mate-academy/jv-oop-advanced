package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double areaCalculator() {
        return (Math.PI * radius * radius);
    }

    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.areaCalculator()
                + " sq.units, radius: "
                + this.getRadius()
                + " units, color: "
                + this.getColor());
    }
}
