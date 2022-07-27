package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + this.getArea() + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + super.getColor();
    }

    @Override
    public Double getArea() {
        return (double)firstLeg * secondLeg;
    }
}
