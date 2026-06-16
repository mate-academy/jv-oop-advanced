package core.basesyntax;

public class RightTriangle extends Figure{
    private double legOne;
    private double legTwo;

    public RightTriangle(String color, Double legOne, Double legTwo) {
        super(color);
        this.legOne = legOne;
        this.legTwo = legTwo;
    }

    @Override
    public double getArea() {
        return (legOne * legTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.2f sq. units, leg one: %.2f sq. units" +
                        ", leg two: %.2f sq. units, color: %s"
                , getArea(), legOne, legTwo, getColor()));
    }
}
