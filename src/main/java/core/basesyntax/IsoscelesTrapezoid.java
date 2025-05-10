package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstParallelSide;
    private double secondParallelSide;
    private double height;

    public IsoscelesTrapezoid(double firstParallelSide, double secondParallelSide, double height,
                              String color) {
        super(color);
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstParallelSide + secondParallelSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstParallelSide: " + firstParallelSide
                + ", secondParallelSide: " + secondParallelSide
                + ", height: " + height
                + " units, color: " + getColor());
    }
}
