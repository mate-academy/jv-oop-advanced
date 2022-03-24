package core.basesyntax;

public class RightTriangle extends Figure {
    private double area;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = (double)(firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle"
                + ", area: " + area + " sq.units"
                + ", firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + super.getColor().toLowerCase();
    }

    @Override
    public void paint() {
        System.out.println(this);
    }
}
