package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drow() {
        System.out.println("Figure: Square"
                + ", area: "
                + getArea()
                + " sq.units"
                + ", side: "
                + side
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
