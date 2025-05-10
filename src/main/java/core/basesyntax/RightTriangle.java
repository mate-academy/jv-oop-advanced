package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("FIGURES: rightTriangle, area: " + calculateArea()
                + " sq.units, sides: firstLeg " + firstLeg
                + " units, secondLeg " + secondLeg + " units, color: " + getColor());
    }
}
