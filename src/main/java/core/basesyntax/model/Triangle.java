package core.basesyntax.model;

public class Triangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Triangle(String name, Color color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + name
               + ", area: " + getArea()
               + " sq.units, firstLeg: " + firstLeg
               + " units, secondLeg: " + secondLeg
               + " units, color: " + color;
    }
}
