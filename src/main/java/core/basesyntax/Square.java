package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
        obtainTheArea();
    }

    public void obtainTheArea() {
        setArea(side * side);
    }

    @Override
    public String draw() {
        return "Figure: Square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor();
    }
}
