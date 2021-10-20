package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private int radius;

    public Circle(String color) {
        this.setColor(color);
    }

    public Circle(String color, int radius) {
        this.setColor(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }
}
