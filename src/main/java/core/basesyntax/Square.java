package core.basesyntax;

public class Square extends Figure {
    private int firstLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "square, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "color: " + getColor().toLowerCase();
    }
}
