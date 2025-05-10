package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = Math.sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: right triangle,"
                                        + "color: %s, first leg: %.2f, second leg: %.2f, "
                                        + "hypotenuse: %.2f, area: %.2f",
                                        this.color, this.firstLeg, this.secondLeg,
                                        this.hypotenuse, this.getArea()));
    }
}
