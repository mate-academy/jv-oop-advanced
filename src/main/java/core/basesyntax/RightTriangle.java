package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public RightTriangle(double firstLeg, double secondLeg, double hypotenuse, String color) {
        this.setColor(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calcArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("This is right triangle with first leg - "
                + this.firstLeg + ", secondLeg - " + this.secondLeg
                + ", hypotenuse - " + this. hypotenuse
                + ", color - " + this.getColor()
                + " and area - " + this.calcArea());
    }
}
