package core.basesyntax;

public class Rectangle extends ColorFigure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

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
    public void draw() {
        System.out.println("Figure: rectangle, area:  "
                + getArea() + " sq. units, " + "firstSide: " + firstSide
                + " units, " + "secondSide: " + secondSide + " units, color: " + getColor());
    }

    public double getArea() {
        return firstSide * secondSide;
    }

}
