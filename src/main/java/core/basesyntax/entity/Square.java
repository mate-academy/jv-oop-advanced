package core.basesyntax.entity;

public class Square extends Figure implements FigureBehaviour {
    public static final double MAX_SIDE = 25;
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void printSquare() {

    }
}
