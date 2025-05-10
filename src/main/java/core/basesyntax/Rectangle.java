package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color,double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void figureInfo() {
        System.out.println(String.format("Figure: rectangle, area: %f sq.units, "
                + "firstSide: %f units, secondSide: %f  units, color: %s", getArea(),
                        firstSide, secondSide, super.getColor()));

    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
