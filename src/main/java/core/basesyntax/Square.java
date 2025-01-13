package core.basesyntax;

public class Square extends Rectangle {
    public Square(double firstSide, double secondSide) {
        super(firstSide, secondSide);
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, area: " + obtainTheArea() + ", color: " + color + ", side: " +
                getFirstSide());
    }
}
