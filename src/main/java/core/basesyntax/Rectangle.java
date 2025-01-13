package core.basesyntax;

public class Rectangle extends Figure implements DrawTheFigure, ObtainTheArea {
    private double firstSide;
    private double secondSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }


    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, area: " + obtainTheArea() + ", first side: " + firstSide +
                ", second side: " + secondSide);
    }

    @Override
    public double obtainTheArea() {
        return firstSide * secondSide;
    }
}
