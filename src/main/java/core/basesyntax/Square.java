package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.setSide();
    }

    public int getSide() {
        return side;
    }

    public void setSide() {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: RightTriangle, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
