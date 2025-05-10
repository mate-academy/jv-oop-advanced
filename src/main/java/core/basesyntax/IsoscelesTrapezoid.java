package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topParallelSide;
    private double bottomParallelSide;
    private double side;

    public IsoscelesTrapezoid(
            Color color, double topParallelSide,
            double bottomParallelSide, double side) {
        super(color);
        if (topParallelSide < bottomParallelSide) {
            this.topParallelSide = topParallelSide;
            this.bottomParallelSide = bottomParallelSide;
        } else {
            this.topParallelSide = bottomParallelSide;
            this.bottomParallelSide = topParallelSide;
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((topParallelSide + bottomParallelSide) / 2)
                * (Math.sqrt(side * side
                - Math.pow((bottomParallelSide - topParallelSide) / 2, 2)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "topParallelSide: " + topParallelSide + " units, "
                + "bottomParallelSide: " + bottomParallelSide + " units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
