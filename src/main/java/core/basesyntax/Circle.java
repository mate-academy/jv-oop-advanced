package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    
    public Circle(double radius, Color color) {
        this.radius = radius;
        setArea(3.14 * radius * radius);
        setPerimeter(2.0 * 3.14 * radius);
        setColor(color);
    }
    
    public double getDiameter() {
        return radius * 2;
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
    
    @Override
    public String getParameters() {
        return String.format("Circle, radius: %f units, area: %f sq. units, "
                + "perimeter: %f units, color: %s", radius, getArea(), getPerimeter(), getColor());
    }
}
