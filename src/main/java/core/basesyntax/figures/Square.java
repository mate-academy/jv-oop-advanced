package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
        this.area = side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, area: " + area
                + " sq.units, side: " + side
                + " units, color: " + color);
    }
}
