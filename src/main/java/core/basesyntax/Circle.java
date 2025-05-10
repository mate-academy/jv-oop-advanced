package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
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
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Figure circle, area: " + getArea()
                + " radius: " + getRadius()
                + " color: " + getColor();
    }
}
