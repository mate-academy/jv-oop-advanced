package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.color = color;
        super.area = findArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + super.area
                + " sq.units, first side: " + this.firstSide
                + " units, second side: " + secondSide
                + " units, color: " + super.color);
    }

    @Override
    protected double findArea() {
        double unformattedArea = firstSide * secondSide;
        return Math.round(unformattedArea * 1000.0) / 1000.0;
    }
}
