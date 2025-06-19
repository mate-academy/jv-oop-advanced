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
    public double obtainArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: circle, area: " + obtainArea() + " sq. units, radius: "
                + radius + " units, color: " + color);
    }
}
