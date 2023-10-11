package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        System.out.println("Circle{" + "radius=" + radius
                + ", color='" + getColor() + '\'' + ", area=" + getArea() + '}');
        return "";
    }
}
