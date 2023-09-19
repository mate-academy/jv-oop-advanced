package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }


    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String display() {
        return "Figure: rectangle, area " + String.format("%.2f", calculateArea()) + " sq. units, firstLeg " + firstLeg
                + " units, secondLeg " + secondLeg + " units, color: " + getColor();
    }
}
