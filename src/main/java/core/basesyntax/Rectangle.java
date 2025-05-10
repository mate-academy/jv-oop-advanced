package core.basesyntax;

public class Rectangle extends Square {
    private double firstSide;
    private double secondSide;

    public void setSide(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, first side: "
                + getFirstSide() + " units, second side: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
