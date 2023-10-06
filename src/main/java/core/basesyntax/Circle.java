package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius,String color) {
        this.radius = radius;
        setColor(color);
        getArea();
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
