package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, "
                + "area: " + this.getArea() + " sq.units "
                + "radius: " + radius + " units "
                + "color: " + this.getColor();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
