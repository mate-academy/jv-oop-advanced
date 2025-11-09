package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallelSide;
    private final double secondParallelSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstParallelSide,
                              double secondParallelSide, double height) {
        super(color);
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.firstParallelSide + this.secondParallelSide) * this.height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, firstBase: " + firstParallelSide + " units, secondBase: "
                + secondParallelSide + " units, height: "
                + height + " units, color: " + getColor());
    }
}
