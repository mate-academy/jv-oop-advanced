package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, area: " + obtainTheArea() + ", color: "
                + getColor() + ", first side: "
                + firstSide + ", second side: " + secondSide);
    }

    @Override
    public double obtainTheArea() {
        return firstSide * secondSide;
    }

}
