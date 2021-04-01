package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longSide;
    private int shortSide;
    private int legs;

    public IsoscelesTrapezoid(int longSide, int shortSide, int legs, Color color) {
        this.longSide = longSide;
        this.shortSide = shortSide;
        this.legs = legs;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (longSide + shortSide) / 2
                * Math.sqrt(legs * legs - Math.pow(Math.abs(longSide - shortSide), 2) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, long side: " + longSide
                + " units, short side: " + shortSide
                + " units, legs: " + legs
                + " units, color: " + getColor());
    }
}
