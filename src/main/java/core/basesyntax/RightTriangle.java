package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    
    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, firstLeg: "
                + String.format("%.2f", firstLeg) + ", secondLeg: "
                + String.format("%.2f", secondLeg) + " units, color: " + color);
    }

    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
