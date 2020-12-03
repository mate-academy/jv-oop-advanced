package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void doAllCalculations() {
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + Math.round(getArea())
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
