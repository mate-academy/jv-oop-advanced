package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }

    public double getSide() {
        return side;
    }
}
