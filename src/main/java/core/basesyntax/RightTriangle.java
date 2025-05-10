package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double countArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle"
                + ", area: " + countArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
