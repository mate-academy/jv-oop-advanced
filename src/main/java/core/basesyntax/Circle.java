package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle() {
    }

    public Circle(int radius, Color color) {
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
                + "color:" + colorSupplier.getRandomColor());
    }
}
