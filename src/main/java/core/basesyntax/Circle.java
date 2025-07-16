package core.basesyntax;

public class Circle extends Figure {

    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        if (radius <= 0) {
            System.out.println("Radius is less than one");
            return;
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "circle, "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + color;
    }
}
