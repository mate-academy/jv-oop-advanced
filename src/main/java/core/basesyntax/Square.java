package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void returnInfo() {
        System.out.println("Figure: square, area: " + side * side
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
