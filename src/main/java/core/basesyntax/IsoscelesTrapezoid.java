package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double heigh;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double heigh) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.heigh = heigh;
    }

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) * heigh / 2;
    }

    @Override
    public void draw() {
        System.out.println("FIGURES: isoscelesTrapezoid, area: " + calculateArea()
                + " sq.units, sides: firstLeg "
                + firstLeg + " units, secondLeg " + secondLeg
                + " units, heigh " + heigh
                + " units, color: " + getColor());
    }
}

