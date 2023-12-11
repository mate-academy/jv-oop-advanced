package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle:    area = %.2f sq. units, radius = %.2f units, "
                + "color = %s%n", this.area, this.radius, this.color);
    }
}
