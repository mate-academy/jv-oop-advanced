package core.basesyntax;

public class Square extends Rectangle {

    public Square(Color color, int side) {
        super(color, side, side);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + getHeigh() + " units, color: " + getColor().name().toLowerCase());
    }
}
