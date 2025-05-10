package core.basesyntax;

public class Rectangle extends FigureSupplier {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double secondSide, double firstSide) {
        super(color);
        this.secondSide = secondSide;
        this.firstSide = firstSide;
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
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color: " + getColor());
    }
}
