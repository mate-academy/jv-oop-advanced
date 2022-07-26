package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square(String color, int side) {

        super(color);
        this.side = side > 0 ? side : 0;
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void draw() {
        System.out.println(" Figure: square, area: "
                + this.getArea() + " sq.units, side: "
                + this.getSide() + " units, color: "
                + this.getColor());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
