package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public String draw() {
        return "Figure: triangle, area: "
                + this.getArea() + " sq.units, first leg: "
                + this.firstLeg + " units, second leg: "
                + this.secondLeg + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public Figure create() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.firstLeg = getRandom().nextInt(getMaxSize());
        rightTriangle.secondLeg = getRandom().nextInt(getMaxSize());
        rightTriangle.setColor(getColorSupplier().getRandomColor());
        return rightTriangle;
    }
}
