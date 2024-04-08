package core.basesyntax;

public class Square extends AbstractFigure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq. units, side: "
                + this.side + ", color: " + super.getColor());
    }
}
