package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.color = color;
    }

    public Circle() {
    }

    @Override
    public double ObtainArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void DrawArea() {
        System.out.println("Figure: circle, area: " + ObtainArea() + " sq. units, radius: "
                + radius + " units, color: " + color);
    }
}
