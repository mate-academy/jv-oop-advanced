package core.basesyntax;

public class Square extends Figure {
    private int sides;

    public Square(int sides, Color color) {
        super(color);
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Square: "
                + "sides = " + sides
                + ',' + super.toString();
    }

    @Override
    public double areaCalculator() {
        return sides * sides;
    }
}
