package core.basesyntax;

public class Square extends Figure {
    private int side;

    //counting area of square
    @Override
    public double countArea(Figure figure) {
        return area = Math.pow(side, 2);
    }

    public void printInfo(Figure figure) {
        System.out.println("Figure: square, " + "area: " + figure.countArea(figure)
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
