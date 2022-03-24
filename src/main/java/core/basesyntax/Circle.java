package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String colors) {
        super(colors);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawingField() {
        System.out.println("Figure: circle, "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColors());
    }
}
