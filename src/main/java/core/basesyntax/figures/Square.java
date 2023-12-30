package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + color.toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
