package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        double hypotenuse = Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, hypotenuse: " + hypotenuse
                + ", color: " + getColor());
    }
}
