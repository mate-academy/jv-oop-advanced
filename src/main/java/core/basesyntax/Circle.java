package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private double radius = Math.random() * 10;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq. units, radius: " + String.format("%.1f", radius)
                + " units, color:" + getColor();
    }
}
