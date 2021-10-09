package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    void setSide(int side) {
        this.side = side;
    }

    int getSide() {
        return this.side;
    }

    @Override
     public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area " + getArea() + " sq.units,"
                + " side: " + getSide() + " units," + " color: " + getColor());
    }
}
