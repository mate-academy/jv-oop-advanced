package core.basesyntax;

public class Circle extends Properties {
    private int radius = 15;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * (radius * radius);

    }

    @Override
    public void drawFigure() {
        System.out.println("Circle, area: " + obtainArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }

}
