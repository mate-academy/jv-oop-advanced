package core.basesyntax;

public class Circle extends Figure {
    private double raduis;

    public Circle(double radius, String color) {
        super(color);
        this.raduis = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * raduis * raduis;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + calculateArea()
                + " sq units, radius: " + raduis + "units, color: " + getColor());
    }
}
