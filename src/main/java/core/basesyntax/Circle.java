package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void getDraw() {
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
