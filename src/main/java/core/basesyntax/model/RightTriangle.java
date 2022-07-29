package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(Color color) {
        super(color);
    }

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + calculateArea() + " sq.units, firstLeg = "
                + getFirstLeg() + " units, secondLeg = "
                + getSecondLeg() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
