package core.basesyntax;

public class Circle extends Figure  implements AreaCalculator, Drawer{
    private int radius;

    public Circle() {

    }

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
            + "area: " + getArea() + " sq. units, "
            + "radius: " + radius + " units, "
            + "color: " + color
        );
    }
}
