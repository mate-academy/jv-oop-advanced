package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        area = getArea();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / Constant.DIVISION_FOR_AREA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " color: " + color.toLowerCase());
    }
}
