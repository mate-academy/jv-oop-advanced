package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String color, double firstLeg, double secondLeg, double hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, "
                + "first leg: " + getFirstLeg() + " units, "
                + "second leg: " + getSecondLeg() + " units, "
                + "hypotenuse: " + getHypotenuse() + " units, "
                + "color: " + getColor());
    }
}
