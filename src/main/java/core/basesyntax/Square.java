package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
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
    public double getArea() {
        return side * 4;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor());
    }
}
