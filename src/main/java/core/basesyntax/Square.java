package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;
    private double secondLeg;

    Square(String color, double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("FIGURES: square, area: " + calculateArea()
                + " sq.units, sides: firstLeg " + firstLeg
                + " units, secondLeg " + secondLeg + " units, color: " + getColor());
    }
}
