package core.basesyntax;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Triangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: " + formatDouble(area(),1)
                 + " sq.units, firstLeg: " + formatDouble(firstLeg)
                 + " units, " + "secondLeg: " + formatDouble(secondLeg)
                 + " units, color: " + getColor();
    }
}
