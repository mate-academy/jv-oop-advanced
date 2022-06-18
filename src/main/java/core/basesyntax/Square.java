package core.basesyntax;

public class Square extends Figures {
    private final double side;

    public Square(double side, String color) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "square, area: " + area() + " sq.units, side: "
                + side + " units, color: " + getColor();
    }

    @Override
    public double area() {
        return side * side;
    }
}
