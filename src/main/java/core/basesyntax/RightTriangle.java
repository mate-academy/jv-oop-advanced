package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return Math.ceil(firstLeg * secondLeg / 2 * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rightTriangle"
                + ", area: " + calculateArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }

}
