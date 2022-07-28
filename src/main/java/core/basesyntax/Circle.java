package core.basesyntax;

public class Circle extends Figure implements Drawable{
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
