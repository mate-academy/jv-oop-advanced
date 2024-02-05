package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int parallelSide;

    public IsoscelesTrapezoid(String name,
                              int area,
                              String color,
                              int firstSide,
                              int secondSide,
                              int parallelSide) {
        super(name, area, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.parallelSide = parallelSide;

    }

    @Override
    public String toString() {
        return super.toString() + " First Side: " + firstSide + ", Second Side: " + secondSide
                + ", Parallel Side: " + parallelSide;
    }
}
