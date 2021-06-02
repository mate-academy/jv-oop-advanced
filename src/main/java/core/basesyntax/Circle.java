package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + calculateArea()
                + "; " + "Radius: " + radius + "; " + "Color: " + getColor() + ";");
    }

    @Override
    public double calculateArea() {
        return radius * Math.PI * radius;
    }
}
