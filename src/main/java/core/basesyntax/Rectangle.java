package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("FIGURES: rectangle, area: " + calculateArea()
                + " sq.units, sides: firstLeg " + firstLeg
                + " units, secondLeg " + secondLeg
                + " units, color: " + getColor());
    }
}
