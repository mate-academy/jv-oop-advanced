package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
        calculateArea();
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
        calculateArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }

    public double calculateArea() {
        return firstSide * secondSide;
    }
}
