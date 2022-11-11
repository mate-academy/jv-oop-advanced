package core.basesyntax;

public class Square extends Figures implements DrawFigure  {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
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
