package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideOne;
    private int parallelSideTwo;
    private int height;

    public IsoscelesTrapezoid(String color, int parallelSideOne, int parallelSideTwo, int height) {
        super(color);
        this.parallelSideOne = parallelSideOne;
        this.parallelSideTwo = parallelSideTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((parallelSideOne + parallelSideTwo) / 2);
    }

    @Override
    public String toString() {
        return super.toString() + "IsoscelesTrapezoid, " + "area: " + getArea() + " sq.units, "
                + "parallelSideOne: " + parallelSideOne + " units"
                + ", parallelSideTwo: " + parallelSideTwo + " units"
                + ", height: " + height + ", " + "color: " + getColor();
    }
}
