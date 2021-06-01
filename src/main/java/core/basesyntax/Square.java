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

    public double areaCalculator() {
        return (double) (side * side);
    }

    public void draw() {
        System.out.println("Figure: square, area: "
                + this.areaCalculator()
                + " sq.units, side: "
                + this.getSide()
                + " units, color: "
                + this.getColor());
    }
}
