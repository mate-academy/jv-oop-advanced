package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Name: circle, radius: " + radius + ", area: "
                + getFormat().format(getArea()) + ", color: " + color.toLowerCase());
    }
}
