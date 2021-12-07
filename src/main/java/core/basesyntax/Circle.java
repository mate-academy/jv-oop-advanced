package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle, color: " + color.toString()
                + ", radius: " + radius
                + ", area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
