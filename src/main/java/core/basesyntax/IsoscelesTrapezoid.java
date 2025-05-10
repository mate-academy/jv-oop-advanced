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
    public String toString() {
        return "trapezoid, area: " + getArea()
                + " sq.units, first parallel side: " + firstParallelSide
                + " units, second parallel side: " + secondParallelSide
                + " units, height: " + height
                + " units, color: " + getColor().toLowerCase();
    }

    @Override
    public double getArea() {
        return (firstParallelSide + secondParallelSide) * height * 0.5;
    }

    @Override
    public String draw() {
        return this.toString();
    }
}
