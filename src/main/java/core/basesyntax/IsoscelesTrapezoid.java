package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topParallelSide;
    private int lowerParallelSide;
    private int nonParallelSide;

    public IsoscelesTrapezoid(Color color, int topParallelSide,
                              int lowerParallelSide, int nonParallelSide) {
        super(color);
        this.topParallelSide = topParallelSide;
        this.lowerParallelSide = lowerParallelSide;
        this.nonParallelSide = nonParallelSide;
    }

    @Override
    public double countArea() {
        double height = Math.sqrt(Math.pow(nonParallelSide, 2)
                - (0.5 * Math.pow(lowerParallelSide - topParallelSide, 2)));
        return height * 0.5 * (topParallelSide + lowerParallelSide);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + countArea()
                + " sq.units, topParallelSide: " + topParallelSide
                + " units, lowerParallelSide: " + lowerParallelSide
                + " units, nonParallelSide: " + nonParallelSide
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
