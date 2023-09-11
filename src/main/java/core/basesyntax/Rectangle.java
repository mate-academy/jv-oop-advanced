package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int areaCalculation() {
        return firstLeg * secondLeg;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure: rectangle, area: " + areaCalculation()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color.name());
    }
}
