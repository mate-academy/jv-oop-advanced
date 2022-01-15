package core.basesyntax;

public class Square extends Rectangle {
    /*
    A square is a special case of a rectangle.
    So the class variables match the parent class variable
     */

    Square(Color color, int side) {
        super(color, side, side);
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + getSideA() + " units, "
                + "color: " + getColor().toString().toLowerCase();
    }
}
