package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public double countArea() {
        return Math.pow(side, 2);
    }

    public void draw(Figure figure) {
        System.out.println("Figure: square, " + "area: " + figure.countArea()
                + " sq.units, " + "side: " + side + " units, "
                + "color: " + figure.getColor());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
