package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
        area = side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + area
                + " sq. units, side: " + side
                + " units, color: " + color;
    }
}
