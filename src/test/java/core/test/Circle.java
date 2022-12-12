package core.test;

public class Circle extends Figure{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " unit, color: " + getColor());
    }
}
