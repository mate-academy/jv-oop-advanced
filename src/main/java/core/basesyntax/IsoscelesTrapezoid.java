package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double edgeShort;
    private double edgeLong;
    private double edgeSide;

    public IsoscelesTrapezoid(Color color, double edgeShort, double edgeLong, double edgeSide) {
        super(color);
        this.edgeShort = edgeShort;
        this.edgeLong = edgeLong;
        this.edgeSide = edgeSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, edgeShort: " + edgeShort + " units, edgeLong: "
                + edgeLong + " units, edgeSide " + edgeSide + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double perimeter = (edgeShort + edgeLong + 2 * edgeSide) / 2;
        return Math.sqrt((perimeter - edgeShort) * (perimeter - edgeLong)
                * (perimeter - edgeSide) * (perimeter - edgeSide));
    }
}
