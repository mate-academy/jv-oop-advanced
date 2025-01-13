package core.basesyntax;

public class Rectangle extends Square {
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(firstSide);
        this.setColor(color);
        this.secondSide = secondSide;
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
                + getFirstSide() + ", second side: " + secondSide);
    }

    @Override
    public double obtainTheArea() {
        return getFirstSide() * secondSide;
    }

}
