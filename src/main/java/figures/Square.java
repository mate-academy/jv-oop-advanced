package figures;

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
    public void draw() {
        System.out.printf("Figure: square, area: %4.2f sq.units"
                + ", side: %2d units"
                + ", color: %s%n", getArea(), getSide(), getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
