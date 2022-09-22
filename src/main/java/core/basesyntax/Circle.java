package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String draw() {
        return " Figure: circe,  area: " + getArea() + " sq.units, side: "
                + getRadius() + " units, color: " + getColor();
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
