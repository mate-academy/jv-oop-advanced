package core.basesyntax;

public class Square extends Figure {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private double leg;

    public Square(Color color, double leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, areа: " + getArea()
                + " sq. units, side: " + leg + " units, color: " + getColor());
    }
}
