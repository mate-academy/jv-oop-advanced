package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double areaCalculation() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, area: " + areaCalculation()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
