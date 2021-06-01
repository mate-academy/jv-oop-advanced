package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + "; " + "Area: " + calculateArea() + "; " + "Radius: " + radius + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
}
