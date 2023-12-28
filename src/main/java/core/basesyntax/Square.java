package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.2f", getArea())
                + " sq. units, side: " + side
                + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
