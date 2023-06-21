package core.basesyntax.figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int leg) {
        super(color);
        this.side = leg;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + "sq.units, side: "
                + side + " units, color: "
                + getColor());
    }
}
