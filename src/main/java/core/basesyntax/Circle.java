package core.basesyntax;

public class Circle extends Figure {
    private int radius;

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