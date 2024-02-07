package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double countArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, firstLeg = "
                + firstLeg + " units, secondLeg = " + secondLeg
                + " units, area = " + countArea() + " sq.units, color = " + getColor().name());
    }
}
