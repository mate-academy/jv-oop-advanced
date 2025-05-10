package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + this.getArea() + " sq. units, radius: "
                + this.radius + " units, color: " + this.getColor());
    }
}
