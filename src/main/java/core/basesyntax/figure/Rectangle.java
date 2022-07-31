package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String figureType, String color, double firstSide, double secondSide) {
        super(figureType, color);
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
    public String draw() {
        return "Figure: " + getFigureType()
                + ", area: " + getArea() + " sq.units,"
                + " firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return firstSide != secondSide ? firstSide * secondSide : 0.0;
    }
}
