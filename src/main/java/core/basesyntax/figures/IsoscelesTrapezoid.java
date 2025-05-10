package core.basesyntax.figures;

public class IsoscelesTrapezoid extends AbstractFigure {
    private int firstParallelSide;
    private int secondParallelSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallelSide,
                              int secondParallelSide, int height) {
        super(color);
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "first parallel side: " + firstParallelSide
                + " units, second parallel side: " + secondParallelSide
                + " units, color: " + color.toLowerCase());
    }

    @Override
    public double getArea() {
        return 0.5 * (firstParallelSide + secondParallelSide) * height;
    }
}
