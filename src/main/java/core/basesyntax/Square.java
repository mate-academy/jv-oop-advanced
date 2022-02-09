package core.basesyntax;

public class Square extends Figure implements FigureArea, Draw {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getDraw() {
        String draw = "Figure: side -" +  getSide() +  getColor() +  getArea();
        return draw;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
