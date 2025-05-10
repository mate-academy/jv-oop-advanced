package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FigureType.SQUARE.getValue() + ", area: "
                + df.format(calculateArea()) + " sq.units, side: " + this.side + " units, color: "
                + super.color);
    }
}
