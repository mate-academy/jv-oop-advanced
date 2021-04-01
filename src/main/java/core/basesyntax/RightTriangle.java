package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int hypotenuse, int firstLeg, int secondLeg, String color) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg * secondLeg) / 2.0);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, hypotenuse "
                + "hypotenuse: " + hypotenuse + " units, color: " + getColor());
    }
}
