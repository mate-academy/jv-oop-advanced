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

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + (firstLeg * secondLeg) / 2
                + " sq.units, firstSide: " + firstLeg + " units, secondSide: "
                + secondLeg + " units, hypotenuse: " + hypotenuse
                + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle was drawn");
    }
}
