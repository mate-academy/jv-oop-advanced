package core.basesyntax;

public class Circle extends Figure implements Areacount {
    private int radius;

    public Circle(int radius,String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "area: " + getArea() + " || " + "color: " + getColor() + '}';
    }
}
