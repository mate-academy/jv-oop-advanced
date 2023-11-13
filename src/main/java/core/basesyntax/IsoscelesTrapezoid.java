package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int parallel1;
    private final int parallel2;
    private final int height;

    public IsoscelesTrapezoid(String color, int parallel1, int parallel2, int height) {
        super(color);
        this.parallel1 = parallel1;
        this.parallel2 = parallel2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (parallel1 + parallel2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, parallel1: " + (double) parallel1
                + " units, parallel2: " + (double) parallel2
                + " units, height: " + (double) height
                + " units, color: " + getColor());
    }
}
