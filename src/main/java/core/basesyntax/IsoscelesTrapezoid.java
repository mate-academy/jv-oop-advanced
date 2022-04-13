package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
double largeBase;
double smallBase;
double side;
double height;

    @Override
    public double getSquare() {
        square = 0.5 * (largeBase + smallBase) * height;
        return square;
    }
    public void printSquareInfo() {
        System.out.println();
    }
}
