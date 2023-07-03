package core.basesyntax.figures;

public class Square extends Figures {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                           + " sq.units, side: " + side
                           + " " + unitOrUnits(side) + ", color: " + getColor().getInfo());
    }
}
