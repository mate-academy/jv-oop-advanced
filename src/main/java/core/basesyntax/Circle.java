package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Circle, area: "
                            + getArea()
                            + " sq.units, radius: "
                            + getRadius()
                            + " units, color: "
                            + getColor());
    }
}
