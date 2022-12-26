package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallelSide;
    private int secondParallelSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallelSide, int secondParallelSide, int height) {
        super(color);
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((this.firstParallelSide + this.secondParallelSide) / 2) * this.height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: " + calculateArea()
                + " sq.units, first Parallel Side: " + this.firstParallelSide + " units, second Parallel Side: "
                + this.secondParallelSide + " units, height: " + this.height + " units, color: " + this.getColor());
    }
}
