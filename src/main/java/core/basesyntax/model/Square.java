package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, area: " + calculateArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
