package core.basesyntax;

public class Square extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getAreaFigure() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getAreaFigure()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
