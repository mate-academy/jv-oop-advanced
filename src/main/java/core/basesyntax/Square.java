package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area(Figure figure) {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area(this)
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
