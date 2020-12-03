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
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
