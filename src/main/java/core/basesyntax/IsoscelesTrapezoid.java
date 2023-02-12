package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
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
    public double getArea() {
        return ((firstParallelSide + secondParallelSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + getArea() + " sq.units"
                + ", firstParallelSide: " + firstParallelSide
                + ", secondParallelSide: " + secondParallelSide
                + ", height: " + height
                + ", color: " + getColor());
    }
}
