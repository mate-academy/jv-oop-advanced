package core.basesyntax;

public class Circle extends Figure implements Drawing, AreaCalculator {
    private int radius;

    public Circle(int radius, Colors color) {
        this.radius = radius;
        this.setColor(color);
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle , area is " + calculateArea() + " sq. units, sides: " +  getRadius()  + " units, color: " + getColor();
    }
}
