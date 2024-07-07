package core.basesyntax;

public class Rectangle extends FigureColor {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, first side: " + firstSide + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }
}
