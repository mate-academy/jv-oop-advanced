package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
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
        System.out.println(String.format("Figure: rectangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + "  sq. units, secondLeg: " + secondLeg
                + "units, color: " + getColor()));
    }
}
