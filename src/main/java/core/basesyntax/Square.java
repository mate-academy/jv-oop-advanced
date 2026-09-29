package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("square, area: " + this.getArea() + " sq. units, side: " + this.side
                + " , color: " + this.getColor());
    }
}
