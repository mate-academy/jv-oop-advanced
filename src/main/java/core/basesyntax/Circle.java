package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, InformationPrinter {
    private double radius;
    
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public void drawIt() {
        System.out.println("Figure - circle, color - " + getColor()
                + ", area - " + getArea()
                + ", radius - " + getRadius());
    }
}
