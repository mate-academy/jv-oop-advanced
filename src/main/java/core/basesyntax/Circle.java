package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        setColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public double getCircuit() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String draw() {

        return "Figure:" + " circle, "
                + " area: " + getArea()
                + " color: " + getColor()
                + " radius: " + getRadius()
                + " circuit: " + getCircuit();
    }
}
