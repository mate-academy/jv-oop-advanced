package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + calculateArea()
                + " sq.units, firstLeg: " + firstLeg
                + "units, secondLeg:" + secondLeg + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }
}
