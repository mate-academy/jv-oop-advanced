package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: "
                + color);
    }

    @Override
    public String getArea() {
        return String.format("%.1f", (double) side * side);
    }
}
