package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: " + calculateArea() + " sq.units, side: "
                + this.side + " units, color: " + this.getColor());
    }
}
