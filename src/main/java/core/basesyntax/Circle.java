package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, Color color) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + new Circle()
                + "area:" + new Circle().getArea() + "units"
                + "side:" + radius + "units"
                + "color:" + getColorSupplier().getRandomColor());
    }
}
