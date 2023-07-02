package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double edge;
    private double largeBase;
    private double smallBase;

    public IsoscelesTrapezoid(double edge, double largeBase, double smallBase, String color) {
        this.edge = edge;
        this.largeBase = largeBase;
        this.smallBase = smallBase;
        super.color = color;
        super.area = findArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + super.area
                + " sq.units, edge: " + this.edge
                + " units, large base: " + largeBase
                + " units, small base: " + smallBase
                + " units, color: " + super.color);
    }

    @Override
    protected double findArea() {
        double height = Math.sqrt(Math.pow(edge, 2) - Math.pow(((largeBase - smallBase) / 2), 2));
        double unformattedArea = (largeBase + smallBase) * height / 2;
        return Math.round(unformattedArea * 1000.0) / 1000.0;
    }
}
