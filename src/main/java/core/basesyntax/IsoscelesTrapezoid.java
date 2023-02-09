package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lateralSide;
    private final double topParallelSide;
    private final double bottomParallelSide;

    public IsoscelesTrapezoid(Color color,
                              double lateralSide,
                              double topParallelSide,
                              double bottomParallelSide) {
        super(color);
        this.lateralSide = lateralSide;
        this.topParallelSide = topParallelSide;
        this.bottomParallelSide = bottomParallelSide;
    }

    @Override
    public double area() {
        return ((bottomParallelSide + topParallelSide) / 2)
                * (Math.pow((bottomParallelSide - topParallelSide) / 2,2)
                - Math.pow(lateralSide,2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.2f", area())
                + " sq.units, lateral side: "
                + lateralSide
                + " units, top parallel side:"
                + topParallelSide
                + " units, bottom parallel side:"
                + bottomParallelSide
                + " color: "
                + getColor().name());
    }
}
