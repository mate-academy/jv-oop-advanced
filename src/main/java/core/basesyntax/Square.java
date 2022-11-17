package core.basesyntax;

public class Square extends Figures implements DrawFigure, GetArea  {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public Square(int side) {
        this.side = side;
    }



    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area:" + this.getArea() + " sq.units, side: " + this.side + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
