package core.basesyntax;

public class Square extends Figure{
    public int side;
    public Square(String color, int side) {
        super(color);
        this.side = side;
    }
    @Override
    public double getAriaCalculation() {
        return side * side ;
    }
    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, area: " + getAriaCalculation() + " sq.units, side: " + side + " units, color: " + color);
    }
}
