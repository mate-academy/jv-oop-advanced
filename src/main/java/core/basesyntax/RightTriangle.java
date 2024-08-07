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
    public double calculateArea() {
        return (double) Math.round((firstLeg * secondLeg) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + this.calculateArea()
                + " sq. units, first leg: "
                + this.firstLeg
                + " units, second leg: "
                + this.secondLeg
                + " units, color : "
                + super.getColor());
    }
}
