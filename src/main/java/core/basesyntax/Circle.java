package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

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
        System.out.print("Figure:" + getClass().getSimpleName()
                + "area:" + this.getArea() + "units"
                + "side:" + radius + "units"
                + "color:" + this.color);
    }
}
