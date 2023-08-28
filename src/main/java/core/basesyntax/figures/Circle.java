package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;
    private int diameter;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle. Color: " + getColor() + ". Area: " + calculateArea()
                + ". Radius: " + radius + ". Diameter: " + diameter + '.');
    }
}
