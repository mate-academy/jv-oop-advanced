package core.basesyntax;

public class Square extends Figure {
    private int side;


    void setSide(int side) {
        this.side = side;
    }

    int getSide() {
        return this.side;
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
     public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area " + getArea() + " sq.units," + " side: " + getSide() + " units," + " color: " + getColor());
    }
}
 //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue