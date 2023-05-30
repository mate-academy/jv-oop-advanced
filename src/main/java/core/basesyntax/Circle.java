package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, Color color) {
        super.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Circle area = " + getArea() + ", color: "
                + color.name() + ", radius: " + radius);
    }
}
