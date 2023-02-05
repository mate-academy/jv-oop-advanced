package core.basesyntax;

public class Circle implements Drawable, AreaCalculator {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
