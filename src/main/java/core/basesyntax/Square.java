package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
        figureType = FigureType.SQUARE;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void getFigureInfo() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, side: " + this.side
                + " units, color: " + this.color);
    }
}
