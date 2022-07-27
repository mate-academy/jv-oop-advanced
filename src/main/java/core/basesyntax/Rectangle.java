package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public Double getAreaCalculator() {
        return (double)firstLeg * secondLeg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, area: " + this.getAreaCalculator()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + super.getColor());
    }
}
