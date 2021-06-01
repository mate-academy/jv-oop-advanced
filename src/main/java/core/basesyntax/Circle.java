package core.basesyntax;

public class Circle extends Figure implements AreaCalculatable {
    private double radius;

    public Circle(String name, String color, double area, double radius) {
        super(name, color, area);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + area + "; " + "Raduis: " + radius + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
}
