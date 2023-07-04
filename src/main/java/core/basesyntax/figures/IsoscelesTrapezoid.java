package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double edge;
    private final double largeBase;
    private final double smallBase;

    public IsoscelesTrapezoid(double edge, double largeBase, double smallBase, String color) {
        super(color);
        this.edge = edge;
        this.largeBase = largeBase;
        this.smallBase = smallBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + findArea()
                + " sq.units, edge: " + this.edge
                + " units, large base: " + this.largeBase
                + " units, small base: " + this.smallBase
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        double height = Math.sqrt(Math.pow(edge, 2) - Math.pow(((largeBase - smallBase) / 2), 2));
        return (largeBase + smallBase) * height / 2;
    }
}
