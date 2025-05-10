package core.basesyntax;

public class Rectangle extends FigureForm {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Figure.Rectangle + ", area: "
                + getArea() + " sq.units, " + "side1: " + firstSide + " units, "
                + "side2: " + secondSide + " units, " + "color: " + getColor());
    }
}
