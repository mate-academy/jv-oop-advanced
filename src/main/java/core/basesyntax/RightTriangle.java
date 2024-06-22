package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String color,
                         double firstLeg,
                         double secondLeg,
                         double hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq. units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg + " units, "
                + ", hypotenuse: " + this.hypotenuse + " units, color: " + getColor());
    }
}
