package core.basesyntax.model;

public class Triangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Triangle(String name, double area, Color color, int firstLeg, int secondLeg) {
        super(name, area, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color;
    }
}
