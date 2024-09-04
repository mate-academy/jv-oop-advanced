package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    private double calculateAndSetArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square, area: " + calculateAndSetArea()
                + " sq. units, side: " + side + " units, color: " + getColor();
    }
}
