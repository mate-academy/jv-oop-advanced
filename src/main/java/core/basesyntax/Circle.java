package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int length) {
        super("circle", color);
        this.radius = length;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + radius + " units, color: " + color + ".");
    }
}
