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
        System.out.println();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
