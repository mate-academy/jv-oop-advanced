package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int nonParallelSide;
    private final int firstParallelSide;
    private final int secondParallelSide;

    public IsoscelesTrapezoid(Color color, int nonparallelSide,
                              int firstParallelSide, int secondParallelSide) {
        super(color);
        this.nonParallelSide = nonparallelSide;
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
    }

    @Override
    public double countArea() {
        double height = Math.sqrt(Math.pow(nonParallelSide, 2) - Math.pow(((double)
                firstParallelSide - secondParallelSide) / 2, 2));
        return ((firstParallelSide + secondParallelSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, non parallel side = " + nonParallelSide
                + " units, first parallel side = " + firstParallelSide
                + " units, second parallel side = "
                + secondParallelSide + " units, area = " + countArea() + " sq.units, color = "
                + getColor().name());
    }
}
