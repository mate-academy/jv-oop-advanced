package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void printfInfoAboutFigure() {
        System.out.println("Figure: square, area: " + side * side + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
