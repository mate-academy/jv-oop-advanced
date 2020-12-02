package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    
    public Circle(double radius, Color color) {
        this.radius = radius;
        setArea(3.14 * radius * radius);
        setPerimeter(2.0 * 3.14 * radius);
        setColor(color);
    }
    
    @Override
    public void draw() {
        System.out.printf("Circle, radius: %f units, area: %f sq. units, perimeter: %f units,"
                + "color: %s%n", radius, getArea(), getPerimeter(), getColor());
    }
    
    public double getDiameter() {
        return radius * 2;
    }
    
    public double getRadius() {
        return radius;
    }
}
