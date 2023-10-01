package core.basesyntax.model;

public class Square extends Figure implements AreaCalculator {
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
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
