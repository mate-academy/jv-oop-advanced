package core.basesyntax;

public class Square extends Figure {
    private double firstSide;

    public Square(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, area: " + obtainTheArea() + ", color: "
                + getColor() + ", first side: " + firstSide);
    }

    @Override
    public double obtainTheArea() {
        return Math.pow(firstSide, 2);
    }
}
