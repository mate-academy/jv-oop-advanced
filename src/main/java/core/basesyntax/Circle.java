package basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure : Circle, Area :" + getArea() + " Radius: " + radius
                + " Color: " + color.name());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
