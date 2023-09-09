package core.basesyntax;

public class Square extends Figure implements AreaCalculator, FigurePrinter {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }
}