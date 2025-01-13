package core.basesyntax;

public class Square extends Rectangle {
    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, area: " + obtainTheArea() + ", color: " + color + ", side: " +
                getFirstSide());
    }
}
