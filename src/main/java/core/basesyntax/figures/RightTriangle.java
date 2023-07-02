package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public RightTriangle(double firstLeg, double secondLeg, double hypotenuse, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
        super.color = color;
        super.area = findArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + super.area
                + " sq.units, first leg: " + this.firstLeg
                + " units, second leg: " + this.secondLeg
                + " units, hypotenuse: " + this.hypotenuse
                + " units, color: " + super.color);
    }

    @Override
    protected double findArea() {
        double unformattedArea = firstLeg * secondLeg / 2;
        return Math.round(unformattedArea * 1000.0) / 1000.0;
    }
}
