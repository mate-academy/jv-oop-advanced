package core.basesyntax;

public class Square extends Figure {
    //квадрат
    public int side;

    public Square(Color color, int side) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        System.out.println("Figure: square, area : " + getArea() + "sq.units, side: " + side + " units, color: " + getColor());
    }
}
