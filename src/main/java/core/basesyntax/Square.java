package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: square, area: "
                + area() + " sq.units, side: "
                + side + " units, color: "
                + getColor().name());
    }
}

