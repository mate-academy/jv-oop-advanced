package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final double AREA_COEFFICIENT = 0.5;
    private final int lowBase;
    private final int highBase;
    private final int edge;

    public IsoscelesTrapezoid(String color, int lowBase, int highBase, int edge) {
        super(color);
        this.lowBase = lowBase;
        this.highBase = highBase;
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return AREA_COEFFICIENT * (lowBase + highBase) * edge;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + this.getArea()
                + " sq.units" + ", low base: "
                + lowBase + " units, "
                + "high base: " + highBase
                + "edge: " + edge
                + " units, "
                + "color: " + color
                + '\'' + '}');
    }
}
