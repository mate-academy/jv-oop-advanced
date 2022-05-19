package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        System.out.println("Circle. Radius: " + radius + ". Area: " + getArea() + ". Color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
