package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int parallelSide;

    public IsoscelesTrapezoid(String name, int area, String color, int fSide, int secSide, int parSide) {
        super(name, area, color);
        this.firstSide = fSide;
        this.secondSide = secSide;
        this.parallelSide = parSide;

    }

    @Override
    public String toString() {
        return super.toString() + " First Side: " + firstSide + ", Second Side: " + secondSide
                + ", Parallel Side: " + parallelSide;
    }
}
