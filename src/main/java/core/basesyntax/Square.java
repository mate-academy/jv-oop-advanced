package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        if (side <= 0) {
            System.out.println("Side must be bigger than 0");
            return;
        }
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, side = " + side + " units;"
                + " area = " + String.format("%.2f", getArea()) + " sq.units;"
                + " color = " + super.color;
    }
}
