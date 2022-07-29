package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + "area: " + this.getArea() + " sq.units "
                + "side: " + side + " units "
                + "color: " + this.getColor();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
