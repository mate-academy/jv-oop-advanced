package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        setName(name);
        setColor(color);
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
        double circleArea = Math.PI * radius * radius;
        return Math.round(circleArea * 100.0) / 100.0;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", Area: " + getArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}
