package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaFigure() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getAreaFigure()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
