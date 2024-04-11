package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;
    private final double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = Math.ceil(firstLeg * 10) / 10;
        this.secondLeg = Math.ceil(secondLeg * 10) / 10;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.ceil((firstLeg * secondLeg / 2) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: RightTriangle, area: " + area + " sq. units, firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg + ", color: " + getColor());
    }
}
