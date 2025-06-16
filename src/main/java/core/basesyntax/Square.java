package core.basesyntax;

public class Square extends Figure {
    private final int side = 5;

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + calculateArea() + " sq. units, side: " + side +" units, color: " + color;
    }
}
