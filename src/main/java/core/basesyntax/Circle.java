package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, int radius, String name) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + FigureName.CIRCLE + ", color: "
                + getColor() + ", radius: " + radius + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
